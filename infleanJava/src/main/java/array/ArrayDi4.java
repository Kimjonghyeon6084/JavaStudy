package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2*3 2차원 배열은 만든다.
        int[][] arr = new int[2][3];

        int i = 1;
        // 순서대로 1씩 증가하는 값을 입력한다.
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++ ;
            }
        }

        // 2차원 배열 길이를 활용
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " "); //0열 출력
            }
            System.out.println(); //한 행이 끝나면 라인을 변경한다.
        }
    }
}
