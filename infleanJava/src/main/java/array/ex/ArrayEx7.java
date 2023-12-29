package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "수학", "영어"}; // 답안지 추가부분

//        int sum = 0;
//        double average = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요 : ");
            for (int j = 0; j < 3; j++) {
//                if (j == 0) {//필요 x
//                    System.out.print("국어 점수 : ");
                System.out.print(subjects[j] + " 점수 : ");// 답안지 추가부분
                scores[i][j] = scanner.nextInt();
            } // row for문 하나씩 끝날 때 마다 각각 학생의 총점과 평균을 정해놔야 할까??
        }
//        int sum1 = scores[0][0] + scores[0][1] + scores[0][2];
//        int sum2 = scores[1][0] + scores[1][1] + scores[1][2];
//        int sum3 = scores[2][0] + scores[2][1] + scores[2][2];
//        int sum4 = scores[3][0] + scores[3][1] + scores[3][2]; // for문으로 못 짜서 하드코딩 한 부분


//            double average1 = (double) sum1 / 3;
//            double average2 = (double) sum2 / 3;
//            double average3 = (double) sum3 / 3;
//            double average4 = (double) sum4 / 3; // 필요x


//            for (int i = 0; i < 4; i++) {
//                System.out.println(i + "번 학생의 총점 : " + (sum + i) + ", 평균 : " +
//                        (average + i));
//            } // 필요 x
        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = (double) total / 3.0;
            System.out.println((i + 1) + "번 학생의 총점 : " + total + ", 평균 : " + average);
        }
    }
}

