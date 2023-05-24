import java.util.ArrayList;

public class HW11 {
//Declare global variables of your name, Add all your group names in list, using
//for each loop iterate and print ONLY your name.
    static String Mynam= "Nimit";

    public static void main(String[] args) {
        ArrayList<String>javaGroup= new ArrayList<>();
         javaGroup.add("Shweta");
         javaGroup.add("Kruti");
         javaGroup.add("Anish");
         javaGroup.add(Mynam);
        for (String n:javaGroup) {
            System.out.println(javaGroup.get(3));
        }

    }

}
