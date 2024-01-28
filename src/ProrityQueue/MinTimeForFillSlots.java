package ProrityQueue;

import java.util.LinkedList;
import java.util.Queue;

public class MinTimeForFillSlots {
    public static void  MinPath(int arr[],int n,int k){
        Queue<Integer> q= new LinkedList<>();

        boolean visit[]=new boolean[n+1];
        for (int i=0;i<k;i++){
            visit[arr[i]]=true;
            q.add(arr[i]);
        }
        int time=0;
        while (q.size()>0){
            for (int i=0;i<q.size();i++){
                 int curr=q.poll();

                 if (curr-1>=1 && !visit[curr-1]){
                     visit[curr-1]=true;
                     q.add(curr-1);
                 }

                 if (curr+1<=n && !visit[curr+1]){
                     visit[curr+1]=true;
                     q.add(curr+1);
                 }
            }
            time++;
        }

        System.out.println(time-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=5;
        int n=5;
        MinPath(arr, n, k);
    }
}
