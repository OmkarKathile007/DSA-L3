package BinarySearchTree;

public class BinarySearchTreePractice {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
        }
    }

    public static Node insertNode(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if (root.data>val){
            root.left=insertNode(root.left,val);
        }
        else{
            root.right=insertNode(root.right,val);
        }

        return root;
    }

    public static void Inorder(Node root){
        if (root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
     int value[]={5,1,3,4,2,7};
     Node root=null;
     for (int i=1;i<value.length;i++){
         root=insertNode(root,value[i]);
     }
     Inorder(root);

    }
}
