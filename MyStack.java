package com.bridgelabz.DataStructure;


public class MyStack {

private final MyLinkedList MyLinkedList;

public MyStack()
{
	this.MyLinkedList=new MyLinkedList();
}

public void push (INode Node)
{
	MyLinkedList.add(Node);
}
public void printStack()
{
	MyLinkedList.printMyNodes();
}
public INode peak()
{
	return MyLinkedList.head;
}

public INode pop() {
	// TODO Auto-generated method stub
	return MyLinkedList.pop();
}
}
