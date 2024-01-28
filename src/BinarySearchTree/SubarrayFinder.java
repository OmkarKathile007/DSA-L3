package BinarySearchTree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Reader;


public class SubarrayFinder {

    public static void findSubarray(int[] array, int n) {
        int length = array.length;

        if (n > length) {
            System.out.println("Subarray length is greater than array length.");
            return;
        }

        for (int i = 0; i <= length - n; i++) {
            int[] subarray = new int[n];
            System.arraycopy(array, i, subarray, 0, n);
            System.arraycopy(array,i,subarray,0,n);
            // Process or print the subarray
            System.out.print("Subarray: ");
            for (int num : subarray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int subarrayLength = 3;
        findSubarray(array, subarrayLength);
    }
}
