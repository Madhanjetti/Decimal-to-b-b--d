import java.util.*;

public class Person {
    public static void main(String[] args) {
        int n = 10;
        long r = 0;
        int i = 1;
        while (n != 0) {
            int rem = n % 2;
            r = r + rem * i;
            n /= 2;
            i *= 10;
        }

        System.out.println(r);

    }

}
