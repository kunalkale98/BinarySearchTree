package com.bst;

public class BinarySearchTree {

    public Node root;

    public BinarySearchTree(){
        this.root = null;
    }

    public <T extends Comparable> void insert(Node node){
        root = insertNew(this.root,node.value);
    }
    public <T extends Comparable> Node<T> insertNew(Node root, T value){
        if (root == null){
            root = new Node(value);
            return  root;
        }
        if (value.compareTo(root.value) == -1){
            root.left = insertNew(root.left,value);
        }
        else if(value.compareTo(root.value) == 1){
            root.right = insertNew(root.right,value);
        }
        return root;
    }

    public void inorder(){
        inorderNew(root);
    }
    public void inorderNew(Node root){
        if (root != null) {
            inorderNew(root.left);
            System.out.println(root.value);
            inorderNew(root.right);
        }
    }

    public int size(){
        return sizeNew(this.root);
    }
    public int sizeNew(Node root){
        if(root == null){
            return 0;
        }
        else
            return(sizeNew(root.left) + sizeNew(root.right) + 1);
    }

    public <T extends Comparable> Node<T> search(T value){
        return searchNew(this.root,value);
    }
    public <T extends Comparable> Node<T> searchNew(Node root, T value){
        if(root == null || root.value == value){
            return root;
        }
        else if(root.value.compareTo(value)<0){
            return searchNew(root.right,value);
        }
        else{
            return searchNew(root.left,value);
        }
    }
}
