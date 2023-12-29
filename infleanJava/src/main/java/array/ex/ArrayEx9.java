package array.ex;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productName = new String[10];
        int[] productPrice = new int[10];
        int maxCount = 10;
        int count = 0;

        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 입력하세요 : ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                if (count >= maxCount) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                } else {
                    System.out.print("상품 이름을 입력하세요 : ");
                    productName[count] = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요 : ");
                    productPrice[count] = scanner.nextInt();
                    count++;
                }
            } else if (menu == 2) {
                if (count == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println(productName[i] + " : " + productPrice[i] + "원");
                    }
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}