package CLASS;

import java.util.Scanner;

public class palindrom {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No:");
        int x= sc.nextInt();
        int y=x;
        int reverse=0;
        while (x!=0) {
            int digit=x%10;
            reverse=digit+reverse*10;
            x=x/10;
        }
        System.out.println(reverse);
        if (y==reverse)
            System.out.println("palindrom");
        else
            System.out.println(" not palindrom");
    }

}
