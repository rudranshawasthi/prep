package ArrayPrep;

import java.util.Scanner;

public class AllNegLeft {
    public static void main(String[] args) {
        Scanner  z = new Scanner(System.in);
        int n = z.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = z.nextInt();
        }
        int neg=0,pos=n-1;
        while (pos>neg){
            if (arr[neg]<0){
                neg++;
            }
            else if (arr[pos]>0){
                pos--;
            }
            else{
                int temp = arr[pos];
                arr[pos] = arr[neg];
                arr[neg] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
