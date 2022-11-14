import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        //int x = 12;
        // x>=10 and x<=20
        //int day = 4;
       // int y = 5;
       // System.out.println(!(y > 3 && y < 10)); // returns false because ! (not) is used to reverse the result
       // System.out.println(x>=10&&x<=20);
       // System.out.println(day==6||day==7);
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("Enter 1st number");
            int num1 = input.nextInt();
            System.out.println("Enter 2nd number");
            int num2 = input.nextInt();

            System.out.println("select one operator :\n 1)+\n2)-\n3)*\n4)/\n5)Exit(Enter E)\n");
            System.out.println("Enter your choice :");

            char choice = input.next().charAt(0);
            String ch = String.valueOf(choice);
            switch (ch) {
                case "+":
                    System.out.println("Addition = "+(num1+num2));
                    break;
                case "-":
                    System.out.println("Subtraction = "+(num1-num2));
                    break;
                case "*":
                    System.out.println("Multiplication = "+(num1*num2));
                    break;
                case "/":
                    if(num2==0){
                        System.out.println("Cant devide by 0");
                        flag=false;
                    }
                    else {
                        System.out.println("Division = "+(num1/num2));
                    }

                    break;
                case "E":
                    input.close();
                    flag=false;
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }

        }
        while(flag);
    }

}






