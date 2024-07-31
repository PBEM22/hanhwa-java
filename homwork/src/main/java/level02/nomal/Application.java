package level02.nomal;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int max, min, length;

        Scanner sc = new Scanner(System.in);
        System.out.print("최솟값 입력: ");
        min = sc.nextInt();

        System.out.print("최댓값 입력: ");
        max = sc.nextInt();

        System.out.println(RandomMaker.randomNumber(min, max));

        System.out.print("정수 길이 입력: ");
        length = sc.nextInt();

        System.out.println(RandomMaker.randomUpperAlphabet(length));

        System.out.println(RandomMaker.rockPaperScissors());

        System.out.println(RandomMaker.tossCoin());

    }
}
