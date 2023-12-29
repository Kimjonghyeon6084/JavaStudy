package scaaner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("이름을 입력하세요(종료를 입력하면 종료) : ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("시스템이 종료됩니다.");
                break;
            }

            System.out.print("나이을 입력하세요 : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);
        }
    }
}
