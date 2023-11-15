#pragma once

#include "Node.h"

template<typename T = int>
class DoubleEndedQueue
{
	const Node<T>* first = nullptr;
	const Node<T>* last = nullptr;
	int N;

public:
	DoubleEndedQueue(){}
	
	bool isEmpty() const { return first == nullptr; }
	
	void addFirst(T item);
	
	T removeFirst();
	
	void addLast(T item);
	
	T removeLast();
	
	T getFirst();
	
	T getLast();
	
	void printQueue();
	
	int size() { return N; }
};