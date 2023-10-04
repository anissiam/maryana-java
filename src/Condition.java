import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);

        Scanner input = new Scanner(System.in);
        System.out.println("please enter the mark");
        int mark=input.nextInt();
        // logical operator
        //and &&
        //T  T  T
        //T  F  F
        //F  T  F
        //F  F  F

        //or ||
        //T  T  T
        //T  F  T
        //F  T  T
        //F  F  F


        //not !
        //T F
        //F T



        if (mark>100 || mark<0){
            System.out.println("Not valid up to 100  OR less than zero");
            return;
        }


        if (mark>=50) {
            System.out.println("pass");

        }else {
            System.out.println("failed");
        }


        /*System.out.println("Plz enter the num");
        int num = scanner.nextInt();*/
        //9 //2 2 2 2 1
        //8 //2 2 2 2 0
        //4 // 2 2 0
        //5 // 2 2 1
        //0 // 0

        // -2 -1 0 1 2
        /*if (num == 0) {
            System.out.println("Zero");
        } else if (num % 2 == 0) {
            System.out.println("EVEN");
            if (num>0){
                System.out.println("Positive");
            }else {
                System.out.println("Negative");
            }
        } else {
            System.out.println("ODD");
        }*/

        /*
        if(الشرط){
        اذا كان صيحيح
        }else{
        //غيرذلك
        }
         */


        /*if (num > 0) {
            System.out.println("Num is bigger than zero");
        } else if (num < 0) {
            System.out.println("Num is less than zero");
        } else {
            System.out.println("Num is zero");
        }
*/
    }
}
