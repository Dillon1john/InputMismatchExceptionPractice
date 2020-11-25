package ExceptionPractice;
import java.util.*;
import java.util.Random;
public class InputMismatchExceptionDemo {
public static int Sum (int number, int number2,int userSum, int sum)throws InputMismatchException{
    sum=number+number2;
    if (userSum != sum)
        throw new InputMismatchException("Incorrect value try again:");
    return sum;
}
        public static void main(String[] args) {
            Random rand = new Random();

            Scanner input = new Scanner(System.in);

            /*if (userSum != sum)
                throw new InputMismatchException("Incorrect value try again:");
            return ();*/
            boolean continueInput;
            int numlimit= 100;

            int number = rand.nextInt(numlimit);
            int number2= rand.nextInt(numlimit);
            int sum= number+number2;
            int userSum = 0;

            do {
                try {
                    //System.out.print("Enter two integers: ");

                    System.out.println( "The first number entered is: " + number+"\n" +
                            "The second number entered is: "+number2);
                     int result= Sum(number,number2,userSum,sum);

                    System.out.println("Enter the sum of these two numbers: ");
                     userSum = input.nextInt();
                     System.out.println("The sum of "+number+" and "+number2+" is:"+result);
                    continueInput = false;

                }
                catch (InputMismatchException ex) {
                    System.out.println("Try again. (" + "Incorrect input: an integer is required)");
                    input.nextLine(); // discard input
                    continueInput=true;
                }

            } while (continueInput);
        }
    }

