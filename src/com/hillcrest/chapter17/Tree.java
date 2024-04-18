package com.hillcrest.chapter17;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    private Node root;


    class Node{
        public Object data;
        public List<Node> children;
        public int size(){
            int sum =0;
            for(var child: children){
                sum = sum + child.size();
            }
            return  1 + sum;
        }
    }
    public int size(){
        if(root==null){
            return 0;
        }
        return root.size();
    }
    public Tree(){

    }
    public Tree(Object rootData){
        root = new Node();
        root.data = rootData;
        root.children = new ArrayList<>();
    }
    public void addSubtree(Tree subtree){
        root.children.add(subtree.root);
    }
}
