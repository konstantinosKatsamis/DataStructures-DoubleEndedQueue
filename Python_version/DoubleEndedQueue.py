from typing import TypeVar, Generic
from abc import ABC, abstractmethod

T = TypeVar('T')

class DoubleEndedQueue(Generic[T], ABC):

    @abstractmethod
    def isEmpty(self) -> bool:
        pass

    @abstractmethod
    def addFirst(self, item: T) -> None:
        pass

    @abstractmethod
    def removeFirst(self) -> T:
        pass

    @abstractmethod
    def addLast(self, item: T) -> None:
        pass

    @abstractmethod
    def removeLast(self) -> T:
        pass

    @abstractmethod
    def getFirst(self) -> T:
        pass

    @abstractmethod
    def getLast(self) -> T:
        pass

    @abstractmethod
    def printQueue(self) -> None:
        pass

    @abstractmethod
    def size(self) -> int:
        pass