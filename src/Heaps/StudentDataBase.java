package Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class StudentDataBase {

    public static class Student implements Comparable<Student> {

        int ID;
        String name;
        int cgpa;

        Student(int ID, String name, int  cgpa) {
            this.ID = ID;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int compareTo(Student s2 ){
           return this.cgpa- s2.cgpa;
        }

        //    }
        public static void main(String[] args) {
            PriorityQueue<Student> pq = new PriorityQueue<>();
//            ArrayList<Student> ID = new ArrayList<>();
            pq.add(new Student(1, "Omkar", 9));
            pq.add(new Student(5, "ABC", 9));
            pq.add(new Student(4, "aadd", 9));
            pq.add(new Student(6, "xyz", 8));
            pq.add(new Student(10, "op", 9));
            pq.add(new Student(5, "ok", 9));

            while (!pq.isEmpty()){
                System.out.println(pq.peek().name+" "+pq.peek().ID+" "+pq.peek().cgpa);
                pq.poll();
            }




        }
    }
}
