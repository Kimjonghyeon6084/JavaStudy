package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요 : ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println(n + "개의 정수를 입력하세요 : ");

        int maxNum; // numbers의 배열 중 가장 큰 수
        int minNum;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        maxNum = numbers[0];
        minNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (minNum > numbers[i]) {
                minNum = numbers[i];
            }
        }

        for (int i = 1; i < numbers.length; i++) {
            if (maxNum < numbers[i]) {
                maxNum = numbers[i];
            }
        }
        System.out.println("가장 작은 정수 : " + minNum);
        System.out.println("가장 큰 정수 : " + maxNum);
    }
}
