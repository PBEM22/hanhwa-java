package level01.basic;

public class Caculator {

    public void checkMethod(){
        System.out.println("메서드 호출 확인");
    }

    public int sum1to10(){
        int result = 0;

        for (int i = 1; i < 11; i++){
            result += i;
        }

        return result;
    }

    public void checkMaxNumber(int a, int b){


            System.out.println("두 수 중 큰 수는 " + Math.max(a, b) + "이다.");

    }

    public int sumTwoNumber(int a, int b){

        return a + b;
    }

    public int minusTwoNumber(int a, int b){


        return Math.abs(a - b);
    }
}
