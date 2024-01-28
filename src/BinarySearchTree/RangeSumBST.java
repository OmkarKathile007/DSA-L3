package BinarySearchTree;

import java.util.ArrayList;

public class RangeSumBST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }


    public static ArrayList<Integer> SumInRange(Node root, int L, int R, ArrayList<Integer> al){
        if (root==null){
            return null;
        }
        if (root.data<R && root.data>L){
            al.add(root.data);
        }
        SumInRange(root.left,L,R,al);
        SumInRange(root.right,L,R,al);
        return al;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left= new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(11);
        root.right.right=new Node(20);
        ArrayList<Integer> al =SumInRange(root,5,20,new ArrayList<>());
        int sum=0;
        for (int i=0;i<al.size();i++){
            sum+=al.get(i);
        }
        System.out.println(sum);


    }
}
