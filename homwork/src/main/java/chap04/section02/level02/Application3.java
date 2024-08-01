package chap04.section02.level02;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        System.out.print("정수를 입력하세요 : ");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++){
            if (i % 2 == 1) sb.append("수");
            if (i % 2 == 0) sb.append("박");
        }

        System.out.print(sb);

        in.close();
    }

    /* 정수를 입력받아 1부터 입력받은 정수까지
     * 홀수이면 "수", 짝수이면 "박"이 정수만큼 누적되어 출력되게 작성하시오.
     *
     * -- 입력 예시 --
     * 정수를 입력하세요 : 5
     *
     * -- 출력 예시 --
     * 수박수박수
     * */
}
