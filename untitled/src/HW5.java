import java.util.ArrayList;

public class HW5 {
    //Write a Java program to test an array list is empty or not. Define array list with
    //underground tube names
    public static void main(String[] args) {
        ArrayList<String> tubnames= new ArrayList<>();// creating an Empty ArrayList

        tubnames.add("Holborn");
        tubnames.add("GreenPark");
        tubnames.add("RusselSquare");
        tubnames.add("OxfordStreet");
        tubnames.add("BondStreet");

        boolean ans = tubnames.isEmpty();
        if(ans == true){
            System.out.println("Uderground tube names list is empty");}
        else {
            System.out.println("Uderground tube names list is not empty");
        }
        System.out.println("Underground tube names in list: "+tubnames);
        tubnames.removeAll(tubnames);
        System.out.println("Underground tube name list is it empty : "+tubnames.isEmpty());

    }
}
