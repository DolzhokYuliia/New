package lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            a *= i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(a);
    }
}




