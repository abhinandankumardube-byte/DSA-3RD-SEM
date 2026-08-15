package LABHW.two;

import java.util.Scanner;

public class DeleteanElementfromanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int x= sc.nextInt();
        for(int i=x;i<n-1;i++){
           arr[i]=arr[i+1];
        }
        for (int i = 0; i <n-1 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

