package calculate;

public class Calculatro {
    static int result;

    public void addition(int a, int b) {
        System.out.println(result);
    }

    public void subtraction(int a, int b) {
        System.out.println(a - b);
    }

    public void division(int a, int b) {
        System.out.println(a / b);
    }

    public void multiplication(int a, int b) {
        System.out.println(a * b);
    }

    public int calculateResult(int a, int b, char symbol) {

       /* String symobl = new Symbol();
        System.out.println("Enter Second No: ");*/
        if (symbol == '+') {
            result = a + b;
            return result;
        } else if (symbol == '-') {
            result = a - b;
            return result;
        } else if (symbol == '*') {
            result = a * b;
            return result;
        } else if (symbol == '/') {
            result = a / b;
            return result;
        }

        return a;
    }
    }