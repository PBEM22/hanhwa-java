package chap13;

import java.util.Scanner;
import java.util.Stack;

public class Application2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String next = " ";
        Stack<String> stack = new Stack<>();


        while (!next.equals("exit")){

            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) :");
            next = in.next();

            stack.push(next);

            System.out.print("최근 방문 url : [");

            if (stack.size() < 5){
                for (int i = stack.size()-1; i >= 0; i--){

                    if (i == 0){
                        System.out.print(stack.get(i));
                    }else {
                        System.out.print(stack.get(i) + ", ");
                    }

                }
            } else {
                for (int i = stack.size()-1; i > stack.size()-6; i--){

                    if (i == stack.size()-5){
                        System.out.print(stack.get(i));
                    }else {
                        System.out.print(stack.get(i) + ", ");
                    }

                }
            }

            System.out.println("]");
        }


    }
}
