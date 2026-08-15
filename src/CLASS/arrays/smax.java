package CLASS.arrays;

import java.util.Scanner;
public class smax {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int smax=Integer.MIN_VALUE;
        int max =Integer.MIN_VALUE;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if (max < arr[i]) {
                smax=max;
                max =arr[i];
            }
            else if (smax<arr[i] && smax<max){
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}
