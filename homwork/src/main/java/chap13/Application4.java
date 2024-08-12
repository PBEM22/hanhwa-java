package chap13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Application4 {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        Scanner in = new Scanner(System.in);
        String option = " ";





        while (true){
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");

            option = in.next();

            if (option.equals("exit")) break;

            if (set.contains(option)){
                System.out.println("이미 등록 된 ID입니다.");
            }

            set.add(option);
        }

        System.out.print("모든 학생의 ID : " + set);

        System.out.println();
    }
}
