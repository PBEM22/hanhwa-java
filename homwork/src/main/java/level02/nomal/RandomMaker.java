package level02.nomal;

public class RandomMaker {

    public static int randomNumber(int min, int max){

        return (int)(Math.random() * (max - min + 1) + min);
    }

    public static String randomUpperAlphabet(int length){
        // 65~90

        String result = "";


        for (int i = 0; i < length; i++){

            int ch = (int)(Math.random() * 26) + 65;

            result += (char)ch;
        }

        return result;
    }

    public static String rockPaperScissors(){

        int v = (int) (Math.random() * 3) + 1;

        if (v == 1){
            return "가위";
        } else if (v == 2){
            return "바위";
        } else if (v == 3) {
            return "보";
        } else {
            return "범위오류";
        }
    }

    public static String tossCoin(){
        int v = (int) (Math.random() * 2);
        if (v == 0){
            return "앞면";
        } else if (v == 1){
            return "뒷면";
        } else {
            return "동전이 세워짐";
        }
    }
}
