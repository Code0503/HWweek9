package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculatro J = new Calculatro();  // created object of the calculator class
        Scanner C = new Scanner(System.in); // created scanner for consul to write numbers

        System.out.println("Enter firstnumber: ");  // sout to write first numbers in sout
        int a = C.nextInt();                      //created variable firast number to enter in console
        System.out.println("Enter secondnumber: ");
        int b = C.nextInt();                  // created second variable to get or enter second number in console
        System.out.println("Enter Symbol: ");
        char symbol = C.next().charAt(0);    // user can enter symbol to get result of first and second number
        J.calculateResult(a, b, symbol);
        if (symbol == '+') {
            J.addition(a, b);
        } else if (symbol == '-') {
            J.subtraction(a, b);
        } else if (symbol == '*') {
            J.multiplication(a, b);
        } else if (symbol == '/') {
            J.division(a, b);
        } else {
            System.out.println("Invalid symobl");
        }
    }
}
