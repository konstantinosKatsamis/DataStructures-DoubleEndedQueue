#pragma once

template <typename T>
class Node
{
	T item;
	Node next = null;
	Node previous = null;
	Node(T data)
	{
		this->item = data;
	}
};