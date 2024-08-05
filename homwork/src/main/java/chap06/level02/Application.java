package chap06.level02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] studentDTO = new StudentDTO[10];

        Scanner in = new Scanner(System.in);
        int count = 0, grade, classRoom, kor, eng, math;
        String name = "";
        String option = "y";

        while (count < 10){
            System.out.print("학년 : ");
            grade = in.nextInt();

            System.out.print("반 : ");
            classRoom = in.nextInt();

            System.out.print("이름 : ");
            name = in.next();

            System.out.print("국어 : ");
            kor = in.nextInt();

            System.out.print("영어 : ");
            eng = in.nextInt();

            System.out.print("수학 : ");
            math = in.nextInt();

            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            option = in.next();

            studentDTO[count] = new StudentDTO(grade, classRoom, name, kor, eng, math);

            count++;

            if (option.equals("n") || !option.equals("y")) break;
        }

        for (int i = 0; i < count; i++){
            System.out.println(studentDTO[i].getInformation());
        }

        in.close();
    }
}
