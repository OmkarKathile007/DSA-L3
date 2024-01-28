package Heaps;

import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentMap;

public class WeakestSoldier {
    public static class Row implements Comparable<Row>{
        int soldier;
        int indx;
        public Row(int soldier,int indx){
            this.indx=indx;
            this.soldier=soldier;
        }

        @Override
        public int compareTo(Row r1){
            if (this.soldier==r1.soldier){ // if Soldiers are same in each row then Compare them according to the index i<j will be th weakest
                return this.indx-r1.indx;
            }
            else{
               return this.soldier-r1.soldier;
            }
        }
    }
    public static void main(String[] args) {
        int army[][]={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}};
        int k=2;
        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i=0;i< army.length;i++){
            int count=0;
            for (int j=0;j<army[0].length;j++){
                count+=army[i][j]==1?1:0;
            }
            pq.add(new Row(count,i));
        }

        for (int i=0;i<k;i++){
            System.out.println("R"+pq.remove().indx);
        }

    }
}
