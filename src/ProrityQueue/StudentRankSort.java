package ProrityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentRankSort {
     static class Student implements Comparable<Student> {
        String name;
        int Rank;

        public Student(String name,int Rank){
            this.name=name;
            this.Rank=Rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.Rank - s2.Rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> rank= new PriorityQueue<>();
        rank.add(new Student("Omkar",1));
        rank.add(new Student("XYZ",2));
        rank.add(new Student("ABC",89));
        rank.add(new Student("OPP",89));
        rank.add(new Student("OK",199));
        rank.add(new Student("qwe",2));

        while (!rank.isEmpty()){
            System.out.println(rank.peek().name+" -> "+rank.peek().Rank);
            rank.remove();
        }
    }
}
