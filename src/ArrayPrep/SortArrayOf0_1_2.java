package ArrayPrep;

import java.util.Scanner;

public class SortArrayOf0_1_2 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = z.nextInt();
        }
        int one=0,two=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==1){
                one++;
            }
            if (arr[i]==2){
                two++;
            }
        }
        int j =0;
        for (int i = 0; i <= (n-one-two-1); i++) {
            arr[j++] = 0;
        }
        for (int i = 0; i < one; i++) {
            arr[j++] =1;
        }
        for (int i = 0; i < two; i++) {
            arr[j++]=2;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
