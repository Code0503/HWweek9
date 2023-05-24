import java.util.HashMap;
import java.util.Iterator;

public class HW7 {
    /*Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.*/
    public static void main(String[] args) {


        HashMap<String, Integer> people = new HashMap<>();
        people.put("Nimit",1);
        people.put("Shweta",2);
        people.put("Kruti",3);
        people.put("Anish",4);

        Iterator<Integer> i= people.values().iterator();
        for (String a:people.keySet()) {
            System.out.print(i.next());
            System.out.print(",");
            System.out.println(a);
        }


    }
}
