package LAB;

import java.util.Scanner;

public class numbertriangle2 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=a; j++) {
                System.out.print(j);
            }
            a--;
            System.out.println();
        }
    }
}
