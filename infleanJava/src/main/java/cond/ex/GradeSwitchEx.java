package cond.ex;

import java.util.ArrayList;

public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade = "C";
        String active;
        switch (grade){
            case "A":
                active = "탁월한 성과입니다";
                break;
            case "B":
                active = "좋은 성과입니다";
                break;
            case "C":
                active = "준수한 성과입니다";
                break;
            case "D":
                active = "향상이 필요합니다";
                break;
            case "F":
                active = "불합격입니다.";
                break;
            default:
                active = "잘못된 학점입니다";
        }
        System.out.println("grade : " + grade + ", active : " + active);


    }
}
