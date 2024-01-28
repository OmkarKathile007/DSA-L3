package Tries;

public class TriesImplement {
    public static class Node{
        Node Children[]=new Node[26];
        boolean eow=false;

        Node(){
            for (int i=0;i<26;i++){
                Children[i]=null;
            }
        }


    }

    public static Node root=new Node();
    public static void Insert(String word){  // O(L)-> largest word length
        Node curr=root;
        for (int level=0;level<word.length();level++){

            int indx=word.charAt(level)-'a';
            if (curr.Children[indx]==null){
                curr.Children[indx]=new Node();
            }
            curr=curr.Children[indx];
        }
        curr.eow=true;
    }


    public static boolean Search(String key){
        Node curr=root;
        for (int i=0;i<key.length();i++){
            int indx=key.charAt(i)-'a';
            if (curr.Children[indx]==null){
                return false;
            }
            curr=curr.Children[indx];
        }
        return curr.eow == true;


    }
    public static boolean WordSearch(String key){
        if (key.length()==0){
            return true;
        }
        for (int i=1;i<=key.length();i++){
            if (Search(key.substring(0,i)) && WordSearch(key.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//         String str[]={"the","a","there","their","any","thee"};
//         for (int i=0;i<str.length;i++){
//             Insert(str[i]);
//         }

        String str[]={"i","like","sam","samsung","mobile","ice"};
        for (int i=0;i< str.length;i++){
            Insert(str[i]);
        }

//        System.out.println(WordSearch("ilikesamsung"));
        System.out.println();
    }
}
