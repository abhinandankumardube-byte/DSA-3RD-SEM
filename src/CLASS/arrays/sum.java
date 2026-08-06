package CLASS.arrays;

import java.util.Scanner;

public class sum {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long sum =0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
