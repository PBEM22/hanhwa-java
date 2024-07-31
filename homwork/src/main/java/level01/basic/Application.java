package level01.basic;

public class Application {
    public static void main(String[] args) {

        Caculator caculator = new Caculator();
        caculator.checkMethod();
        System.out.println(caculator.sum1to10());
        caculator.checkMaxNumber(10, 20);
        System.out.println("10과 20의 합은 : " + caculator.sumTwoNumber(10, 20));
        System.out.println(10 + "과 " + 5 + "의 차는 : " + caculator.minusTwoNumber(10, 5));
    }
}
