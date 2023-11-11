from DoubleEndedQueue import *

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
        return self.size == 0
    
    def addFirst(self, item: T) -> None:
        n = Node(item)
        if self.isEmpty():
            self.first = n
            self.last = self.first
        else:
            n.next = self.first
            self.first.previous = n
            self.first = n        

        self.size = self.size + 1
    
    def removeFirst(self) -> T:
        if self.isEmpty():
            return None
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
        n = Node(item)
        if self.isEmpty():
            self.last = n
            self.first = self.last
        else:
            n.previous = self.last
            self.last.next = n
            self.last = n
        
        self.size = self.size + 1
    
    def removeLast(self) -> T:
        if self.isEmpty():
            return None
        returned = self.getLast()
        if (self.last == self.first):
            self.last = None
            self.first = None
        else:
            self.last = self.last.previous
            self.last.next = None
        
        self.size = self.size - 1
        return returned
    
    def getFirst(self) -> T:
        if self.isEmpty():
            return None
        else:
            return self.first.data
    
    def getLast(self) -> T:
        if self.isEmpty():
            return None
        else:
            return self.last.data
    
    def printQueue(self) -> None:
        if self.isEmpty():
            print("The Queue is Empty")
        else:
            n = self.first
            i = 1
            while(n != None):
                print(i, ". ", sep="", end="")
                print(n.data)
                n = n.next
                i = i + 1
    
    def getSize(self) -> int:
        return self.size
