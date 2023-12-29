package scaaner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int inputNum = scanner.nextInt();
        System.out.println(inputNum + "단의 구구단");

//        int num = 1;

//        while (true) {
//            int multiValue = inputNum * num;
//            System.out.println(inputNum + " * " + num + " = " + multiValue);
//            num++;
//            if (num == 10) {
//                break;
//            }
//        }
        for (int num = 1; num <= 9; num++) {
            int multiValue = inputNum * num;
            System.out.println(inputNum + " * " + num + " = " + multiValue);
        }
    }
}
