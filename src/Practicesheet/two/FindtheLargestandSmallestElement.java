package Practicesheet.two;

import java.util.Scanner;

public class FindtheLargestandSmallestElement {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if (max < arr[i]) {
                max =arr[i];
            }
            if (min > arr[i]) {
                min =arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
