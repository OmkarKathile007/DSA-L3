package BinarySearchTree;

import java.util.ArrayList;

public class InorderTraversal {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    ///////////////////////////> INSERT ELEMENT IN TREE
    public static Node insert(Node root,int val ){
        if (root==null){
            root =new Node(val);
            return root;
        }
        if (root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }



//////////////////////////////> INORDER TRAVERSAL
    public static void inorderTraversal(Node root){
        if (root==null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }



///////////////////////////////> SEARCH IN SORTED KEY
    public static boolean SearchInSorted(Node root,int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return SearchInSorted(root.left, key);
        } else {
            return SearchInSorted(root.right, key);
        }

    }

////////////////////////////////////> DELETE NODE IN TREE

    public static Node DeleteNodes(Node root,int val){
        if (root.data<val){
            root.right=DeleteNodes(root.right,val);
        }
        else if(root.data>val){
            root.left=DeleteNodes(root.left,val);
        }
        else{
            if (root.left==null && root.right==null){
                return null;
            }

            if (root.left==null){
                return root.right;
            }
            else if (root.right==null){
                return root.left;
            }
            Node Is=findInOrderSuccessor(root.right);
            root.data=Is.data;
            root.right=DeleteNodes(root.right,Is.data);
        }
        return root;
    }

    public static Node findInOrderSuccessor(Node root){
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }



public static Node BinaryTree(Node root,int value){
        if (root==null){
            return null;
        }
        if (root.data==value){
            return null;
        }
        if (root.data>value){
            return BinaryTree(root.left,value);
        }
        else{
            return BinaryTree(root.right,value);
        }
}

/////////////////////////////////> PRINT IN RANGE

    public static void PrintInRange(Node root,int K1,int K2){
        if (root==null){
            return;
        }
        if (root.data<=K2 && root.data>=K1){
            PrintInRange(root.left,K1,K2);
            System.out.print(root.data+" ");
            PrintInRange(root.right,K1,K2);

        }
        else if(root.data<K1){
            PrintInRange(root.left,K1,K2);
        }
        else {
            PrintInRange(root.right,K1,K2);
        }

    }


    ////////////////////////////> PATH TO LEAF NODE


    public static void PrintArray(ArrayList<Integer> al){
        for (int i=0;i<al.size();i++){
            System.out.print(al.get(i)+"->");
        }
        System.out.println();
    }

    public static void PathToLeaf(Node root, ArrayList<Integer> path){
        if (root==null){
            return;
        }
        path.add(root.data);
        if (root.left==null && root.right==null){
            PrintArray(path);
        }
        PathToLeaf(root.left,path);
        PathToLeaf(root.right,path);
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int val[]={4,5,1,2,9,6,7};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }
        inorderTraversal(root);
//
//        System.out.println(BinaryTree(root,5));
//        inorderTraversal(root);
//        System.out.println();
//        if(SearchInSorted(root,9)){
//            System.out.println("Found");
//        }
//        else{
//            System.out.println("Not Found");
//        }
//        System.out.println();
//        root=DeleteNodes(root,4);
//        root=DeleteNodes(root,9);
//        inorderTraversal(root);

//         Print In Range
//        int val[]={8,5,3,1,4,6,10,11,14};
//        Node root=null;
//        for(int i=0;i<val.length;i++){
//            root=insert(root,val[i]);
//        }
//        inorderTraversal(root);
//        System.out.println();
//        PrintInRange(root,5,12);


        ///////> PATH TO LEAF
//        int val[]={8,5,3,6,10,11,14};
//        Node root=null;
//        for(int i=0;i<val.length;i++){
//            root=insert(root,val[i]);
//        }
//        inorderTraversal(root);
//        System.out.println();
//
//        PathToLeaf(root,new ArrayList<>());

    }
}
