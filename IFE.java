import java.util.Scanner;

public class IFE {

    public static void main(String[] args) {
        // check Even or Odd
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

        //Check if number lies between 50 and 100
        int number = 60;
        if (number >= 50 && number <= 100) {
            System.out.println("Number is right");
        } else {
            System.out.println("number is wrong");
        }

        // Check if number is even or odd
        int Num = 23;
        if (Num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        // if time of arrival is before or equal to 10, then allowed to sit, otherwise go back home
        int timeofArrival = 50;
        if (timeofArrival <= 10) {
            System.out.println("Allowed to sit");
        } else {
            System.out.println("Go Home");
        }


    }


}

