package scaaner.ex;

import java.util.Scanner;

public class ChangeVarEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 10;
        int b = 20;
        int temp;

        temp = b;
        b = a;
        a = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
