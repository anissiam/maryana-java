import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter the num");
        int num = scanner.nextInt();

        /*
        if(الشرط){
        اذا كان صيحيح
        }else{
        //غيرذلك
        }
         */


        if (num > 0) {
            System.out.println("Num is bigger than zero");
        } else if (num < 0) {
            System.out.println("Num is less than zero");
        } else {
            System.out.println("Num is zero");
        }

    }
}
