package chap05.level02;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("주민등록번호를 입력하세요 : ");
        String num = in.next();

        num = num.substring(0, 8) + "******";

        System.out.println(num);
    }
}
