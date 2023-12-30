package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        while (true) {
            System.out.println("---------------------------------");
            System.out.print("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            int choice = scanner.nextInt();
            System.out.println("---------------------------------");
            if (choice == 1) {
                System.out.println("선택 : " + choice);
                System.out.print("입금액음 입력하세요 : ");
                int amount = scanner.nextInt();
                balance = deposit(balance, amount);
            } else if (choice == 2) {
                System.out.println("선택 : 2");
                System.out.print("출금액을 입력하세요 : ");
                int amount = scanner.nextInt();
                balance = withdraw(balance, amount);
            } else if (choice == 3) {
                a(balance);
            } else if (choice == 4) {
                exit();
                break;
            }
        }
    }

    public static int deposit(int balance, int amount) {
        Scanner scanner = new Scanner(System.in);
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액 : " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        System.out.println("선택 : " + 2);
        if (balance < amount) {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
            return balance;
        }
    }

    public static void a(int balance) {
        System.out.println("선택 : " + 3);
        System.out.println("현재 잔액 : " + balance);
    }

    public static void exit() {
        System.out.println("선택 : " + 4);
        System.out.println("시스템을 종료합니다.");

    }
}
