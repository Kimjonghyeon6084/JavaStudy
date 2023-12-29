package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        //전위, 후위 증감연산자

        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + " , b = " + b);

        //후위 증감 연산자
        a = 1; // a 값을 다시 1로 지정
        b = 0; // b 값을 다시 0으로 지정

        b = a++;
        System.out.println("a = " + a + ", b = " + b);
    }
}
