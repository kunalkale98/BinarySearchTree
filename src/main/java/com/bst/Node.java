package com.bst;

public class Node<T extends Comparable> {
    public T value;
    public Node<T> left;
    public Node<T> right;

    public Node(T value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
