import java.util.HashSet;

public class HW6 {
    /*Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)*/
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        for (int a : numbers) {
            if (a <= 10 && a >= 0) {
                System.out.println(a);
            } else {
                System.out.println("Not found");
            }
        }
    }
}