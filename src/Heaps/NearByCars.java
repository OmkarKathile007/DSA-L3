package Heaps;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;
import java.util.PriorityQueue;

public class NearByCars {
    static class Cars implements Comparable<Cars>{
        int x;
        int y;
        int distSq;
        int indx;
         public Cars(int x,int y,int distSq,int indx){
             this.x=x;
             this.y=y;
             this.distSq=distSq;
             this.indx=indx;
         }
          @Override
        public int compareTo(Cars c2){
             return this.distSq-c2.distSq;
          }

    }
    public static void main(String[] args) {
        int cars[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Cars> pq = new PriorityQueue<>();
        for (int i=0;i< cars.length;i++){
            int distSq=(cars[i][0]*cars[i][0] + cars[i][1]*cars[i][1]);
            pq.add(new Cars(cars[i][0],cars[i][1],distSq,i));
        }

        for (int i=0;i<k;i++){
            System.out.println("C"+pq.remove().indx);
        }
    }
}
