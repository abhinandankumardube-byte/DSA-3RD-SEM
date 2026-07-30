package CLASS;

import java.util.Scanner;

public class DIGITSUM {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No:");
        int x= sc.nextInt();
        int sum=0;
        while (x!=0) {
            sum+=x%10;
            x=x/10;
        }
        System.out.println(sum);
    }
}
