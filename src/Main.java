import java.util.*;
public class Main {

//        public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
//
//
//            return list;
//        }


    public static String Binary(int n){
        String str="";
        while(n!=0){
            int d=n%2;
            str=d+str;
            n=n/2;
        }

        return str;
    }
    public static void main(String[] args) {

        int nums[] = {4, 6, 5, 9, 3, 7};
        int l[] = {0, 0, 2};
        int r[] = {2, 3, 5};
        ArrayList<Boolean> list = new ArrayList<>();
        int k = 0;
        int[] subarr = new int[0];
        for (int i = 0; i < l.length; i++, k++) {
            subarr = Arrays.copyOfRange(nums, l[k], r[k]+1);
//            int o=0;
//            for(int j=l[k];j<subarr.length;j++){
//                subarr[o++]=nums[j];
//
//            }
//            Arrays.sort(subarr);
//            int diff=subarr[1]-subarr[0];
//            int count=0;
//            for(int j=1;j<subarr.length;j++){
//                if(diff!=(subarr[j]-subarr[j-1])){
//                    list.add(false);
//                    break;
//                }
//                count++;
//            }
//
//            if(count==subarr.length){
//                list.add(true);

            for (int j = 0; j < subarr.length; j++) {
                System.out.print(subarr[j] + " ");
            }
            System.out.println();
        }
//
//
//            System.out.println(subarr.length);
////            k++;


    }

//        ArrayList<Boolean> list1 = new ArrayList<>();
//        list1.add(true);
//        list1.add(false);
//        list1.add(true);
//        list1.add(false);
//        System.out.println(list1);
//
//        int count=0;
//        for (int i=0;i<list1.size();i++){
//
//            count++;
//        }
//        if (count==list1.size()){
//            System.out.println(" dfjddwbhfdhbegefhg ");
//        }


    }
