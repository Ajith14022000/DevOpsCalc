package calculator;

import com.google.common.math.BigIntegerMath;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }
    private static final Logger logger=LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {

            System.out.println("DevOps - Scientific Calculator, Choose to perform operation");
            System.out.print("1.Factorial\n2.Square Root\n3.Natural Logarithm\n4.Power\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter the number : ");
                        number1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        System.out.println("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Result : " + calculator.factorial(number1));
                    break;
                case 2:
                    try {
                        System.out.print("Enter the number : ");
                        number1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        System.out.println("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Result : " + calculator.squareRoot(number1));
                    break;
                case 3:
                    try {
                        System.out.print("Enter the number : ");
                        number1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        System.out.println("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Result : " + calculator.naturalLogarithm(number1));
                    break;
                case 4:
                    try {
                        System.out.print("Enter the Base : ");
                        number1 = scanner.nextDouble();
                        System.out.print("Enter the Exponent : ");
                        number2 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        System.out.println("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Result : " + calculator.power(number1,number2));
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }

    public double power(double number1, double number2) {
        logger.info("[Power] - "+number1+" "+number2);
        double res=Math.pow(number1,number2);
        logger.info("[Power Result] - "+res);
        return res;
    }

    public double naturalLogarithm(double number) {
        logger.info("[Natural Logarithm] - "+number);
        double res=Math.log(number);
        logger.info("[Natural Logarithm Result] - "+res);
        return res;
    }

    public double squareRoot(double number) {
        logger.info("[Square Root] - "+number);
        double res=Math.sqrt(number);
        logger.info("[Square Root Result] - "+res);
        return res;
    }

    public BigInteger factorial(double number) {
        logger.info("[Factorial] - "+number);
        BigInteger res = BigIntegerMath.factorial((int)number);
        logger.info("[Factorial Result] - "+res);
        return res;
    }

}