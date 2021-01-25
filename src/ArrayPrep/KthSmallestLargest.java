package ArrayPrep;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestLargest {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int k = z.nextInt();
        int n = z.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = z.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        System.out.println(arr[n-k]);
    }
}
