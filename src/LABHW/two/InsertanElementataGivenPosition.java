package LABHW.two;
import java.util.Scanner;
public class InsertanElementataGivenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int x= sc.nextInt();
        int element= sc.nextInt();
        int [] brr=new int[n+1];
        for(int i=0;i<x;i++){
                brr [i]=arr[i];
        }
        brr [x]=element;
        for (int i = x; i <n ; i++) {
            brr [i+1]=arr[i];
        }
        for (int i = 0; i <n+1 ; i++) {
            System.out.print(brr[i]+" ");
        }
    }
}
