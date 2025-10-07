import java.util.*;


public class Insertion {


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }



    public static void InsertNode(TreeNode root,int val){
        if(root==null){
            root=new TreeNode(val);
            return;
        }

        while(true){
            if(root.val<val){
                if(root.right!=null){
                    root=root.right;
                }
                else{
                    root.right=new TreeNode(val);
                    return;
                }
            }
            else{
                if(root.left!=null){
                    root=root.left;
                }
                else{
                    root.left=new TreeNode(val);
                    return;
                }
            }
        }
    } 

    public static void inorder(TreeNode root){
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void preorder(TreeNode root){
        if(root==null) return;


        System.out.print(root.val+" ");
        preorder(root.left);
        
        preorder(root.right);
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(13);

        preorder(root);
        InsertNode(root, 16);
        System.out.println("After Insertion" );
        preorder(root);

        

    }
    
}
