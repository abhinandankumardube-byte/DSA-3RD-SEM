package LAB;

import java.util.Scanner;

public class ELECTRICITYBILL {
    static void main() {
        System.out.print("Electricity Consume:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int x = 0;
        if (n<=100){
        x=n*10;
        }
        else if (n > 100 && n <= 200) {
        x=100*10+(n-100)*15;
        }
        else if (n > 200 && n <= 300) {
            x=100*10+100*15+(n-200)*20;
        }
        else if (n>300) {
            x=100*10+100*15+100*20+(n-200)*25;
        }
        System.out.println("BILL:"+x);
    }
}
