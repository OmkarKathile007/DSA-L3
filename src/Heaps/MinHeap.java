package Heaps;

import java.util.ArrayList;
import java.util.HashMap;

public class MinHeap {
    public static class Heap{
        ArrayList<Integer> al = new ArrayList<>();

        /////////////////////> Inserting Element in Heap
        public void add(int data){

            al.add(data);

            int x=al.size()-1;
            int par=(x-1)/2;
            while (al.get(x)<al.get(par)){
                int temp=al.get(x);
                al.set(x,al.get(par));
                al.set(par,temp);

                x=par;
                par=(x-1)/2;

            }

        }

        ///////////////////////////////////> Get First Element from Heap peek()
        public  int peek(){
            return al.get(0);
        }



        //////////////////////////////////////> Remove Element From Heap

        private void Heapify(int i){
            int minIndx=i;
            int left=2*i+1;
            int right=2*i+2;

            if (left< al.size() && al.get(minIndx)>al.get(left)){
                minIndx=left;
            }
            if (right<al.size() && al.get(minIndx)>al.get(right)){
                minIndx=right;
            }

            if (minIndx!=i){
                int temp=al.get(i);
                al.set(i,al.get(minIndx));
                al.set(minIndx,temp);

                Heapify(minIndx);
            }

        }
        public int remove(){
             int data=al.get(0);
              int temp=al.get(0);
              al.set(0,al.get(al.size()-1));
              al.set(al.size()-1,temp);

              al.remove(al.size()-1);

              Heapify(0);
              return data;
        }

        ///////////////////////////////////> Check Heap is Empty Or not

        public boolean isEmpty(){
            return al.size()==0;
        }

    }



    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(1);
        pq.add(6);
        pq.add(2);
        pq.add(0);
        pq.add(8);

        while (!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

    }

}
