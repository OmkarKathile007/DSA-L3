package Tries;

public class PrefixProblem {
    public static class Node{
        Node Children[]=new Node[26];
        boolean EoW=false;
        int freq;
        public Node(){
            for (int i=0;i<26;i++){
                Children[i]=null;
            }
            freq=1;
        }

    }




    public static Node root;

    public static void Insert(String word){  // O(L)-> largest word length
        Node curr=root;
        for (int level=0;level<word.length();level++){
            int indx=word.charAt(level)-'a';
            if (curr.Children[indx]==null){
                curr.Children[indx]=new Node();
            }
            else{
                curr.Children[indx].freq++;
            }
            curr=curr.Children[indx];
        }
        curr.EoW=true;
    }


    public static void findPrefix(String str,String ans){
        if (root==null){
            return;
        }
    }

}
