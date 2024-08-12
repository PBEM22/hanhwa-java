package chap13;

import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;

        System.out.print("학생 성적 : " );
        int score = in.nextInt();

        list.add(score);
        System.out.print("추가 입력하려면 y : ");
        String option = in.next();

        while (option.equals("y")){

            System.out.print("학생 성적 : " );
            score = in.nextInt();

            list.add(score);

            System.out.print("추가 입력하려면 y : ");
            option = in.next();

        }

        for (int next : list){
            sum += next;

        }

        System.out.println("학생 인원 : " + list.size());
        System.out.println("평균 점수 : " +  (float) sum / list.size());

    }


}
