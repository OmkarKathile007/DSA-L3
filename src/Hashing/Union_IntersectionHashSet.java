package Hashing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Union_IntersectionHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        int arr[]={7,3,9};
        int arr2[]={6,3,9,2,4};
        ArrayList<Integer> intersection =new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        int k=0;
        for(int i=0;i<arr.length+arr2.length;i++){

            if(i< arr.length){
                hs.add(arr[i]);

            }
            else if(i>=arr.length){
                hs.add(arr2[k++]);
                hs2.add(arr2[k-1]);

            }
        }
        System.out.println(hs);
        k=0;
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (hs2.contains(arr[i])){
                al.add(arr[i]);
                count++;
            }
        }
        System.out.println(al+" "+count);

    }
}
