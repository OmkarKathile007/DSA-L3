package BinarySearchTree;

import java.util.ArrayList;
import java.util.Collections;

public class SortedArrayInBST {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }


    ///////////////////////////>  SORTED ARRAY TO BALANCED TREE
    public static Node BinarySubTreeBalanced(int arr[],int start,int end){
        if (start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root = new Node(arr[mid]);
        root.left=BinarySubTreeBalanced(arr,start,mid-1);
        root.right=BinarySubTreeBalanced(arr,mid+1,end);

        return root;
    }





    ////////////////////////////> CONVERT BST TO BALANCED TREE
    public static void PreorderTraversal(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        PreorderTraversal(root.left);

        PreorderTraversal(root.right);
    }
    static ArrayList<Integer> al = new ArrayList<>();
    public static void InorderTraversa (Node root){
        if (root==null){
            return;

        }
        InorderTraversa(root.left);
        al.add(root.data);
        InorderTraversa(root.right);
    }



    public static void main(String[] args) {

/////////////////////>   SORTED ARRAY TO BALANCED TREE
//        int arr[]={3,5,6,8,10,11,12};
//
//        Node root=BinarySubTreeBalanced(arr,0,arr.length-1);
//        PreorderTraversal(root);




//////////////////////> BST TO BALANCED TREE
//       Node root = new Node(8);
//       root.left=new Node(6);
//       root.left.left = new Node(5);
//       root.left.left.left=new Node(3);
//       root.right=new Node(10);
//       root.right.right=new Node(11);
//       root.right.right.right=new Node(12);
//        InorderTraversa(root);
//
//
//        int arr2[]= new int[al.size()];
//        for (int i=0;i< arr2.length;i++){
//            arr2[i]=al.get(i);
//        }
//        root=BinarySubTreeBalanced(arr2,0, arr2.length-1);
//        PreorderTraversal(root);

/////////////////////////>  SORTED BINARY TREE
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
        al.clear();
        InorderTraversa(root1);
        InorderTraversa(root2);
        System.out.println(al);
        Collections.sort(al);
        int arr[]=new int[al.size()];
        for (int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        root1=BinarySubTreeBalanced(arr,0,arr.length-1);
        PreorderTraversal(root1);


    }
}
