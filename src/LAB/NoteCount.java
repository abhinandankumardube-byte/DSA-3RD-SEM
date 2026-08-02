package LAB;

import java.util.Scanner;

public class NoteCount {
    static void main() {
        System.out.print("Enter Amount:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        count+=n/500;
        n=n%500;
        count+=n/200;
        n=n%200;
        count+=n/100;
        n=n%100;
        count+=n/50;
        n=n%50;
        count+=n/20;
        n=n%20;
        count+=n/10;
        n=n%10;
        count+=n/5;
        n=n%5;
        count+=n/2;
        n=n%2;
        count+=n/1;
        n=n%1;
        System.out.print("Note Count:");
        System.out.print(count);
    }
}
