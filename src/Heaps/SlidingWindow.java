package Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SlidingWindow {
    public static class Pair implements Comparable<Pair>{
        int val;
        int indx;
        Pair(int val,int indx){
            this.val=val;
            this.indx=indx;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.val-this.val;
        }


    }
    public static void main(String[] args) {   /////////////> The Time Complexity of the Algorithm  O(n-logK)
//        int arr[]={1,3,-1,-2,5,3,6,7};
        int arr[]={2,-1,3,4,5,6,7,8,9,10,15,20};
        int k=4;
        int res[]=new int[arr.length-k+1];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i=0;i<k;i++){
            pq.add(new Pair(arr[i],i));
        }
//        System.arraycopy(res,0,res.length,0,5);
        res[0]=pq.peek().val;
        for (int i=k;i<arr.length;i++){
            while (pq.size()>0 && pq.peek().indx<=(i-k)){
                pq.remove();
            }
            pq.add(new Pair(arr[i],i));
            res[i-k+1]=pq.peek().val;
        }

        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
