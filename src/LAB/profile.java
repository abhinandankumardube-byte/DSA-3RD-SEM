package LAB;

import java.util.Scanner;

public class profile {
        static void main() {
            System.out.println("hy buddy");
            Scanner sc = new Scanner(System.in);
            System.out.println(" enter your age ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println(" enter your name ");
            String name = sc.nextLine();
            System.out.println("your age is : " + age + " " + "your name is : " + name);
            sc.close();
        }
    }


