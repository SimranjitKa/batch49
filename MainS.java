import java.util.Scanner;

public class MainS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double storingData = sc.nextDouble();
        switch ((int) storingData) {
            case '+':
                System.out.println("Total sum: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double resultSum = a+b;
                System.out.println("First number" + "+" + "Second number:" + resultSum);
                break;
            case '-':
                System.out.println("result of substration");
                double c = sc.nextDouble();
                double d = sc.nextDouble();
                double resultSub = c+d;
                System.out.println("First number" + "-" + "Second number:" + resultSub);
                break;
            default:
                System.out.println("invalid input");
                }



    }
    }


