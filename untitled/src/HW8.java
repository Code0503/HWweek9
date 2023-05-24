import java.util.HashMap;
import java.util.Scanner;

public class HW8 {
  //Write the program that tell you which line pass through particular stations.
    //Just use Zone 1 stations name. (Challenge)

    public static void main(String[] args) {
        HashMap<String,String>Zone1= new HashMap<>();  //HasMap to put key and values for station and train lines
        Zone1.put("Bondstreet","Central Line/Jublee Line");
        Zone1.put("OxfordCircus","Victoria Line/ Cnetral Line/ Bekrloo Line");
        Zone1.put("GreenPark","Piccadaily Line/ Jublee Line/ Victria Line");
        Zone1.put("PiccadailyCircus","Piccadaily Line/Backerloo line");
        Zone1.put("CharingCross","Northern Line/ Bekarloo Line");
        Scanner zone = new Scanner(System.in);      // scanner for user to enter station name
        System.out.println("Enter Station Name: ");
        String station = zone.next();   // store as vriables what entered in console

        for (String z:Zone1.keySet()) {
            if(station.equalsIgnoreCase(z)){
                System.out.println(Zone1.get(z));
            }
        }

    }

}
