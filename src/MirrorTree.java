import java.util.ArrayList;

public class MirrorTree {
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

    public static Node MirrorTheTree(Node root){
        if (root==null){
            return null;
        }
        Node leftMirror=MirrorTheTree(root.left);
        Node RightMirror=MirrorTheTree(root.right);
        root.left=RightMirror;
        root.right=leftMirror;

        return root;
    }

    public static void PreOrderTraversal(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        PreOrderTraversal(root.left);

        PreOrderTraversal(root.right);
    }
    public static void main(String[] args) {
//        Node root =new Node(8);
//        root.left=new Node(5);
//        root.right=new Node(10);
//        root.left.left=new Node(3);
//        root.left.right=new Node(6);
//        root.right.right=new Node(11);
//        PreOrderTraversal(root);
//        System.out.println();
//
//
//        MirrorTheTree(root);
//        PreOrderTraversal(root);




    }
}
