package ArrayPrep;

import java.util.Scanner;

public class UnionOf2Arrays {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n1 = z.nextInt();
        int n2 = z.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = z.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = z.nextInt();
        }


        int i=0,j=0;
        int ans = 0;

        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                ++i;
                ans++;
            }
            else if (arr1[i] > arr2[j]){
                ++j;
                ans++;
            }
            else {
                ++i;
                ++j;
            }
        }
        ans +=n1+n2-i-j+2;
        System.out.println(ans);
    }
}
