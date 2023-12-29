package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
//        int student1 = 90;
//        int student2 = 80;
//        int student3 = 70;
//        int student4 = 60;
//        int student5 = 50;
//
//        int total = student1 + student2 + student3 + student4 + student5;
//        double average = (double) total / 5;
//
//        System.out.println("점수 총합 = " + total);
//        System.out.println("점수 평균 = " + average);

        // 개선 코드
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        //첫번째로 작성한 코드
//        for (int i = 0; i < students.length; i++) {
//            int student = students[i];
//            total += student;
//        }

        //두번째로 작성한 코드
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }

        //향상된 for문으로
        for (int student : students) {
            total += student;
        }

        double average = (double) total / students.length;

        System.out.println("점수 총합 = " + total);
        System.out.println("점수 평균 = " + average);
    }
}
