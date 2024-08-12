package chap11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("파일 이름을 입력하세요 : ");
        String filePath = in.nextLine();

        try {
            FileReader file = new FileReader(filePath);
            int value;

            while((value = file.read()) != -1) {
	            System.out.print((char) value);
            }

        } catch (IOException e) {
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        }


    }
}
