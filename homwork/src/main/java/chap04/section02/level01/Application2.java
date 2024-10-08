package chap04.section02.level01;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        int result = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++){
            result += i;
        }

        System.out.println("1부터 " + num + "까지의 합 : " + result);

        in.close();
    }

    /* 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요
     *
     * -- 입력 예시 --
     * 정수를 입력하세요 : 5
     *
     * -- 출력 예시 --
     * 1부터 5까지의 합 : 15
     *
     * */
}
