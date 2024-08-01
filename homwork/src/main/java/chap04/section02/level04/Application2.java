package chap04.section02.level04;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        int money = 0, price = 0, result = 0;
        int fifT, tenT, fiveT, oneT, fiveH,oneH, fif, ten;
        int total = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("받으신 금액을 입력하세요 : ");
        money = in.nextInt();

        System.out.print("상품 가격을 입력하세요 : ");
        price = in.nextInt();

        result = money - price;

        total = result;

        fifT = result / 50000;
        result = result % 50000;

        tenT = result / 10000;
        result = result % 10000;

        fiveT = result / 5000;
        result = result % 5000;

        oneT = result / 1000;
        result = result % 1000;

        fiveH = result / 500;
        result = result % 500;

        oneH = result / 100;
        result = result % 100;

        fif = result / 50;
        result = result % 50;

        ten = result / 10;
        result = result % 10;

        System.out.println("============================");
        System.out.println("50000원권 지폐 " + fifT +"장");
        System.out.println("10000원권 지폐 " + tenT +"장");
        System.out.println("5000원권 지폐 " + fiveT +"장");
        System.out.println("1000원권 지폐 " + oneT +"장");
        System.out.println("500원권 동전 " + fiveH +"개");
        System.out.println("100원권 동전 " + oneH +"개");
        System.out.println("50원권 동전 " + fif + "개");
        System.out.println("10원권 동전 " + ten + "개");
        System.out.println("1원권 동전 " + result + "개");
        System.out.println("============================");
        System.out.println("거스름돈 : " + total + "원");

        in.close();
    }

    /* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
     *
     * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
     * 지폐외 동전을 구분하여 단위를 표기하세요
     *
     * -- 입력 예시 --
     * 받으신 금액을 입력하세요 : 100000
     * 상품 가격을 입력하세요 : 22340
     *
     * -- 출력 예시 --
     * ============================
     * 50000원권 지폐 1장
     * 10000원권 지폐 2장
     * 5000원권 지폐 1장
     * 1000원권 지폐 2장
     * 500원권 동전 1개
     * 100원권 동전 1개
     * 50원권 동전 1개
     * 10원권 동전 1개
     * ============================
     * 거스름돈 : 77660원
     * */
}
