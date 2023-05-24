import java.util.ArrayList;

public class HW9 {
    //Write program and add all group names in to array and iterates through for  each loop.


    public static void main(String[] args) {
        ArrayList<String> groupnames = new ArrayList<>(); // declared array list
        groupnames.add("Group-Shweta");
        groupnames.add("Group-Kruti");
        groupnames.add("Group-Anish");
        groupnames.add("Group-Nimit");
        groupnames.add("Group-Dhawal");
        for (String b : groupnames) {
            System.out.println(b);
        }
    }
}
