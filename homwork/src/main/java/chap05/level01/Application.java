package chap05.level01;

public class Application {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i=0; i < arr.length; i++){
            arr[i] = i+1;
            System.out.println(arr[i]);
        }
    }
}
