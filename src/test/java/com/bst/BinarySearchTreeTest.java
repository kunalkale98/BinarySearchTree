package com.bst;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void name() {
        Node<Integer> firstNode = new Node(56);
        Node<Integer> secondNode = new Node(30);
        Node<Integer> thirdNode = new Node(70);
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(firstNode);
        bst.insert(secondNode);
        bst.insert(thirdNode);
        boolean result = bst.root.left.value.equals(30) && bst.root.value.equals(56) && bst.root.right.value.equals(70);
        Assert.assertTrue(result);
        bst.inorder();
    }

}
