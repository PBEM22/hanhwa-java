package chap13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Application6 {

    public static void main(String[] args) throws IOException {

        Map<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while (true){
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");

            input = br.readLine();

            if (input.equals("exit")) return;

            if (input.equals("search")) {
                System.out.print("검색 할 이름 : ");
                input = br.readLine();
                String number = map.get(input);
                if (number == null) {
                    System.out.println(input + "씨의 번호는 등록 되어 있지 않습니다.");
                } else {
                    System.out.println(input +"씨의 전화번호 : " + number);
                }
                continue;
            }

            String[] s = input.split(" ");

            if (s.length < 2) {
                System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");

            } else {
                map.put(s[0], s[1]);
                System.out.println("추가 완료 : " + s[0] + " " + s[1]);

            }
        }

    }
}
