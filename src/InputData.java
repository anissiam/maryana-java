import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {

        //scanner
        //if statment
        /*
        عملية انشاء instance و هذه للادخال من خلال ال console
        in , input , scanner , read
         */
        Scanner input = new Scanner(System.in);//instance // object
        System.out.println("please enter your name");
        String name = input.nextLine();//String

        System.out.println("My name is " + name);
        /*System.out.println("Plz enter the num");
        int number = input.nextInt();//int

        System.out.println("The num is " + number);
        */


    }
}
