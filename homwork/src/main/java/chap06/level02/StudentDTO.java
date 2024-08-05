package chap06.level02;

public class StudentDTO {

    private int grade;

    private int classRoom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentDTO() {
    }

    public StudentDTO(int grade, int classRoom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classRoom = classRoom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public String getInformation(){
        return "학년=" + grade +
                ", 반=" + classRoom +", 이름=" + name +
                ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + math +
                ", 평균=" + (kor + eng + math) / 3;
    }
}
