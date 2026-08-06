package CLASS.arrays;

import java.util.Scanner;

public class search {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int target= sc.nextInt();
        int arr[] = new int[n];
        boolean flag=false;
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if (target == arr[i]) {
                flag=true;
            }
            else
                flag=false;
        }
        System.out.println(flag);
    }
}
