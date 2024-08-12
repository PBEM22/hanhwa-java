package chap13;

import java.util.*;

public class Application5 {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        String word = "";
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            word = in.next();

            if (word.equals("exit")) break;
            if (set.contains(word)) System.out.println("중복된 단어 입니다.");

            set.add(word);
        }


        System.out.println("정렬 된 단어 : " + set);
    }
}
