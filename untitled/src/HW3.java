import java.util.ArrayList;

public class HW3 {
    //Write a Java program to create a new array list, add some colours(string) and
    //printout the collection using for each loop.
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>(); //declared arrey list
        colours.add("Orange");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("White");
        colours.add("Black");
        for (String b:colours
        ) {
            System.out.println(b);

        }
    }
}
