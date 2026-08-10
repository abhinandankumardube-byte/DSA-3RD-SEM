package CLASS.Strings;

import java.util.Arrays;

public class basics {
    static void main(String[] args) {
        char ch[]={'R','a','m'};
        String name = "ram";
        System.out.println(name);
        char ar[]= name.toCharArray();
        System.out.println(Arrays.toString(ar));
        String s1="abcd";
        String s2="abcd";
        if (s1==s2){
            System.out.println("same");
        }
    }
}
