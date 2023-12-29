package cond.ex;

public class MovieRateEx {
    public static void main(String[] args) {
        double rating = 6;

//        if (rating <= 7) {
//            System.out.println("고질라, 토이 스토리, 어바웃 타임을 추천합니다.");
//        } else if (rating > 7 && rating <= 8) {
//            System.out.println("토이 스토리, 어바웃 타임을 추천합니다");
//        } else {
//            System.out.println("어바웃타임을 추천합니다.");
//        }

        if (rating <= 9) {
            System.out.println("어바웃 타임을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("토이 스토리를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("고질라를을 추천합니다.");
        }
    }
}
