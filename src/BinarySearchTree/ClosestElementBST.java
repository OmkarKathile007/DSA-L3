package BinarySearchTree;

public class ClosestElementBST {
    public  static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left= null;
            this.right=null;
        }
    }
//    static int min=Integer.MAX_VALUE;
    public static int BSTminABSDiff(Node root,int key,int min){

        if (root==null){
            return Integer.MAX_VALUE;
        }
        if (root.data==key){
            return 0;

        }
        if (min>Math.abs(root.data-key)){
            min=Math.abs(root.data-key);
            min= root.data;
        }
        if (min<key) {
            min = BSTminABSDiff(root.right, key, min);
        }
        else {
            min = BSTminABSDiff(root.left, key, min);
        }




//        if (root.data>key){
//
//            return BSTminABSDiff(root.left,key,Math.min(min,Math.abs(root.data-key)));
//
//        }
//        if (root.data<key){
//
//            return BSTminABSDiff(root.right,key,Math.min(min,Math.abs((root.data-key))));
//        }
        return min;
    }

    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(11);
//        root.right.left=new Node(10);
        root.right.right=new Node(20);

        System.out.println(BSTminABSDiff(root,19,Integer.MAX_VALUE));

//       int key=8;
//        System.out.println(Math.abs(5-19));
    }
}
