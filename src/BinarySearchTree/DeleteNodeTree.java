package BinarySearchTree;

public class DeleteNodeTree {
    public static InorderTraversal.Node insert(InorderTraversal.Node root, int val ){
        if (root==null){
            root =new InorderTraversal.Node(val);
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

    public static void main(String[] args) {
    }
}
