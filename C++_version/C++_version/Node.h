#pragma once

template <typename T>
class Node
{
	const T item;
	const Node* const next = nullptr;
	const Node* const previous = nullptr;

public:
	T getItem() const { return item; }
	Node(const T i):
		item(i){}
};