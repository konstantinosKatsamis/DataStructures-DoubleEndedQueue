from DoubleEndedQueue import *
from selenium.common.exceptions import NoSuchElementException

class Node(Generic[T]):
    def __init__(self, data: T):
        self.data = data
        self.next = None
        self.previous = None
    
class DoubleEndedQueue_Implementation(Generic[T]):
    def __init__(self):
        self.size = 0
        self.first = None
        self.last = None
    
    def isEmpty(self) -> bool:
        """
        Check if the double-ended queue is empty.

        >>> deq = DoubleEndedQueue_Implementation()
        >>> deq.isEmpty()
        True

        >>> deq.addFirst(1)
        >>> deq.isEmpty()
        False
        """
        return self.first is None
    
    def addFirst(self, item: T) -> None:
        """
        Add an item to the front of the double-ended queue.

        >>> deq = DoubleEndedQueue_Implementation()
        >>> deq.addFirst(1)
        >>> deq.size
        1

        >>> deq.addFirst(2)
        >>> deq.size
        2
        >>> deq.first.data
        2
        >>> deq.last.data
        1
        """
        n = Node(item)
        if self.isEmpty():
            self.first = n
            self.last = self.first
        else:
            n.next = self.first
            self.first.previous = n
            self.first = n        

        self.size += 1
    
    def removeFirst(self) -> T:
        """
        Check for successful deletion of first element of the double-ended queue.

        >>> deq = DoubleEndedQueue_Implementation()
        >>> deq.addFirst(1)
        >>> deq.addFirst(3)
        >>> deq.removeFirst()
        3

        >>> deq.addFirst(4)
        >>> deq.addLast(5)
        >>> deq.removeFirst()
        4
        """
        if self.isEmpty():
            raise NoSuchElementException("Method: 'removeFirst' - The Queue is Empty")
        returned_T = self.getFirst()
        if (self.first == self.last):
            self.first = None
            self.last = None
        else:
            self.first = self.first.next
            self.first.previous = None
        
        self.size = self.size -1
        return returned_T
    
    def addLast(self, item: T) -> None:
        """
        Add an item to the end of the double-ended queue.

        >>> deq = DoubleEndedQueue_Implementation()
        >>> deq.addLast(11)
        >>> deq.size
        1

        >>> deq.addLast(22)
        >>> deq.size
        2
        >>> deq.last.data
        22
        >>> deq.first.data
        11

        >>> deq.addLast(33)
        >>> deq.size
        3
        >>> deq.last.data
        33
        >>> deq.first.data
        11
        """
        n = Node(item)
        if self.isEmpty():
            self.last = n
            self.first = self.last
        else:
            n.previous = self.last
            self.last.next = n
            self.last = n
        
        self.size += 1
    
    def removeLast(self) -> T:
        """
        Check for successful deletion of last element of the double-ended queue.

        >>> deq = DoubleEndedQueue_Implementation()
        >>> deq.addFirst(11)
        >>> deq.addFirst(31)
        >>> deq.removeLast()
        11

        >>> deq.addLast(4)
        >>> deq.getFirst()
        31
        >>> deq.addLast(5)
        >>> deq.addLast(15)
        >>> deq.removeLast()
        15
        """
        if self.isEmpty():
            raise NoSuchElementException("Method: 'removeLast' - The Queue is Empty")
        returned = self.getLast()
        if (self.last == self.first):
            self.last = None
            self.first = None
        else:
            self.last = self.last.previous
            self.last.next = None
        
        self.size -= 1
        return returned
    
    def getFirst(self) -> T:
        """
        Check for getting the first element of the double-ended queue.

        >>> deq = DoubleEndedQueue_Implementation()
        >>> deq.addFirst(11)
        >>> deq.addFirst(31)
        >>> deq.getFirst()
        31

        >>> deq.addLast(4)
        >>> deq.getFirst()
        31

        >>> deq.addFirst(41)
        >>> deq.getFirst()
        41
        """
        if self.isEmpty():
            raise NoSuchElementException("Method: 'getFist' - The Queue is Empty")
        else:
            return self.first.data
    
    def getLast(self) -> T:
        """
        Check for getting the last element of the double-ended queue.

        >>> deq = DoubleEndedQueue_Implementation()
        >>> deq.addFirst(111)
        >>> deq.addFirst(311)
        >>> deq.getLast()
        111

        >>> deq.addLast(41)
        >>> deq.getLast()
        41

        >>> deq.addFirst(411)
        >>> deq.getLast()
        41
        """
        if self.isEmpty():
            raise NoSuchElementException("Method: 'getLast' - The Queue is Empty")
        else:
            return self.last.data
        
    
    
    def printQueue(self) -> None:
        """
        Check for print correctly the double-ended queue.

        >>> deq = DoubleEndedQueue_Implementation()
        >>> deq.printQueue()
        The Queue is Empty

        >>> deq.addFirst(7)
        >>> deq.printQueue()
        1. 7

        >>> deq.addFirst(8)
        >>> deq.printQueue()
        1. 8
        2. 7

        >>> deq.addLast(9)
        >>> deq.printQueue()
        1. 8
        2. 7
        3. 9

        >>> deq.removeLast()
        9
        >>> deq.printQueue()
        1. 8
        2. 7

        >>> deq.removeFirst()
        8
        >>> deq.printQueue()
        1. 7
        """
        if self.isEmpty():
            print("The Queue is Empty")
        else:
            n = self.first
            i = 1
            while(n != None):
                print(i, ". ", sep="", end="")
                print(n.data)
                n = n.next
                i += 1
    
    def getSize(self) -> int:
        """
        Check for getting the size of the double-ended queue.

        >>> deq = DoubleEndedQueue_Implementation()
        >>> deq.addFirst(111)
        >>> deq.addFirst(311)
        >>> deq.getSize()
        2

        >>> deq.addLast(21)
        >>> deq.getSize()
        3

        >>> deq.addLast(212)
        >>> deq.removeFirst()
        311
        >>> deq.getSize()
        3
        """
        return self.size

if __name__ == "__main__":
    import doctest
    doctest.testmod()