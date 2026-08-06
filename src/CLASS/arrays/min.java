package CLASS.arrays;

import java.util.Scanner;

public class min {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int min =Integer.MAX_VALUE;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if (min > arr[i]) {
                min =arr[i];
            }
        }
        System.out.println(min);
    }
}
