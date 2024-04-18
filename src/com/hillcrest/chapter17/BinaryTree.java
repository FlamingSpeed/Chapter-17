package com.hillcrest.chapter17;

public class BinaryTree {
    private Node root;
    class Node{
        public Object rootData;
        public Node left;
        public Node right;
    }
    public BinaryTree()   {
        root = null;
    }
    public BinaryTree(Object rootData, BinaryTree left, BinaryTree right){
        root = new Node();
        root.rootData = rootData;
        root.left= left.root;
        root.right = right.root;
    }
    public static int height(Node node){
        if(node==null){
            return 0;
        }
        return 1+ Math.max(height(node.left),height(node.right));
    }

}
