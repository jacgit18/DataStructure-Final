package edu.citytech.cst.finalexam.utility;

public class Node<T> {
	protected T data;
	protected Node<T> left, right;

	public Node(T data, Node<T> l, Node<T> r) {
		left = l;
		right = r;
		this.data = data;
	}

	public Node(T data) {
		this(data, null, null);
	}

	@Override
	public String toString() {
		
		return "Node [d:" + data + ", l:" + left + ", r:" + right + "]";
	}

}