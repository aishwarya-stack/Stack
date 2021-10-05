package com.bridgelabz.DataStructure;



public interface INode<K> {
	K getKey();

	void setKey(K key);

	INode getNext();

	void setNext(INode next);

}
