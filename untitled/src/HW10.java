import java.util.ArrayList;
import java.util.Iterator;

public class HW10 {
  //  Write program and add all group members names in to array and iterates
    //through for each loop and print your name.

    static String name ="Your name : ";
    public static void main(String[] args) {
        ArrayList<String> groupnames = new ArrayList<>(); // declared array list
        groupnames.add("Shweta");
        groupnames.add("Kruti");
        groupnames.add("Anish");
        groupnames.add("Nimit");
        groupnames.add("Dhawal");
        Iterator<String> i =  groupnames.iterator();
        for (String b  :groupnames) {
            System.out.println(name+groupnames.get(3));
        }



}}
