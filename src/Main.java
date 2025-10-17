import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TallCoaster coaster1 = new TallCoaster("Kingda Ka", "Six Flags Great Adventure", 1, false, LocalDate.of(2005, 5, 21), 456f);
        //System.out.println(coaster1);
        GoodCoaster coaster2 = new GoodCoaster("Steel Vengeance", "Cedar Point", 1, 100, "United States", "Rocky Mountain Construction", 1800);
        //System.out.println(coaster2);


        ArrayList<RollerCoaster> coastersList = new ArrayList<RollerCoaster>();
        coastersList.add(coaster1);
        coastersList.add(coaster2);

        for (RollerCoaster eachCoaster: coastersList){
            System.out.println(eachCoaster);
        }
    }
}
