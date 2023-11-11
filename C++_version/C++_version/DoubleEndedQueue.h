#pragma once
#include "Node.h"

template<typename T>
class DoubleEndedQueue
{
	Node first;
	Node last;
	int N;

public:
	DoubleEndedQueue();
	bool isEmpty();
	void addFirst(T item);
	T removeFirst();
	void addLast(T item);
	T removeLast();
	T getFirst();
	T getLast();
	void printQueue();
	int size();
};