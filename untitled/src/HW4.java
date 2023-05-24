import java.util.ArrayList;
import java.util.Iterator;

public class HW4 {
    //Write a Java program to iterate through all elements in an array list using
    //Iterator.
    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>(); //declared arrey list
        colours.add("Orange");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("White");
        colours.add("Black");
        Iterator<String>b =colours.iterator();
        while (b.hasNext()){
            System.out.println(b.next());
        }
    }
}