package ProrityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();//////////////////////>      Ascending Order Sort
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());/////////////>  Descending Order Sort
        pq.add(19);
        pq.add(21);
        pq.add(56);
//        pq.add(5);
        pq.add(6);
        pq.add(7);
        pq.poll();
        pq.offer(5);
        System.out.println(pq);
//        while(!pq.isEmpty()){
//            System.out.print(pq.peek()+" ");
//            pq.remove();
//        }


    }
}
