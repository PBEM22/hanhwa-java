package chap10;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
            String input = scanner.nextLine();
            LocalDate birthDate = LocalDate.parse(input, formatter);
            LocalDate currentDate = LocalDate.now();
            int age = Period.between(birthDate, currentDate).getYears();

            if (age < 20) {
                throw new InvalidAgeException("만 20세 미만은 입장 불가입니다.");
            } else {
                System.out.println("입장하셔도 됩니다.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램이 종료되었습니다.");
        }
    }
}
