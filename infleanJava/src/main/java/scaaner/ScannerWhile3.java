package scaaner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("사용자가 0을 입력하면 프로그램은 종료됩니다.");

        while (true) {
            System.out.print("정수를 입력하세요.");
            int inputValue = scanner.nextInt();

            sum += inputValue;

            if (inputValue == 0) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
        }
        System.out.println("sum = " + sum);
    }
}
