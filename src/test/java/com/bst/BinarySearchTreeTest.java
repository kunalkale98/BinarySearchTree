package com.bst;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void givenValue_ToInsertFunction_ShouldCreateBST() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(firstNode);
        bst.insert(secondNode);
        bst.insert(thirdNode);
        boolean result = bst.root.left.value.equals(30) && bst.root.value.equals(56) && bst.root.right.value.equals(70);
        Assert.assertTrue(result);
        bst.inorder();
    }

    @Test
    public void givenValues_ToBST_GetSizeOfTree() {
        Node<Integer> firstNode = new Node(56);
        Node<Integer> secondNode = new Node(30);
        Node<Integer> thirdNode = new Node(70);
        Node<Integer> fourthNode = new Node<>(22);
        Node<Integer> fifthNode = new Node<>(40);
        Node<Integer> sixthNode = new Node<>(60);
        Node<Integer> seventhNode = new Node<>(95);
        Node<Integer> eighthNode = new Node<>(11);
        Node<Integer> ninthNode = new Node<>(65);
        Node<Integer> tenthNode = new Node<>(3);
        Node<Integer> eleventhNode = new Node<>(16);
        Node<Integer> twelfthNode = new Node<>(63);
        Node<Integer> thirteenthNode = new Node<>(67);


        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(firstNode);
        bst.insert(secondNode);
        bst.insert(thirdNode);
        bst.insert(fourthNode);
        bst.insert(fifthNode);
        bst.insert(sixthNode);
        bst.insert(seventhNode);
        bst.insert(eighthNode);
        bst.insert(ninthNode);
        bst.insert(tenthNode);
        bst.insert(eleventhNode);
        bst.insert(twelfthNode);
        bst.insert(thirteenthNode);
        bst.inorder();
        int size = bst.size();
        System.out.println("Size of Tree is "+size);
        Assert.assertEquals(13,size);
    }

    @Test
    public void givenBinarySearch_WhenSearchedForValue_ShouldReturnValue() {
        Node<Integer> firstNode = new Node(56);
        Node<Integer> secondNode = new Node(30);
        Node<Integer> thirdNode = new Node(70);
        Node<Integer> fourthNode = new Node<>(22);
        Node<Integer> fifthNode = new Node<>(40);
        Node<Integer> sixthNode = new Node<>(60);
        Node<Integer> seventhNode = new Node<>(95);
        Node<Integer> eighthNode = new Node<>(11);
        Node<Integer> ninthNode = new Node<>(65);
        Node<Integer> tenthNode = new Node<>(3);
        Node<Integer> eleventhNode = new Node<>(16);
        Node<Integer> twelfthNode = new Node<>(63);
        Node<Integer> thirteenthNode = new Node<>(67);


        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(firstNode);
        bst.insert(secondNode);
        bst.insert(thirdNode);
        bst.insert(fourthNode);
        bst.insert(fifthNode);
        bst.insert(sixthNode);
        bst.insert(seventhNode);
        bst.insert(eighthNode);
        bst.insert(ninthNode);
        bst.insert(tenthNode);
        bst.insert(eleventhNode);
        bst.insert(twelfthNode);
        bst.insert(thirteenthNode);
        bst.inorder();
        Node searchResult = bst.search(63);
        System.out.println("Found "+searchResult.value);
        Assert.assertEquals(63,searchResult.value);
    }
}
