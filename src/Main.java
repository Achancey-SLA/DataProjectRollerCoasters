import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        new TallCoaster("Kingda Ka", "Six Flags Great Adventure", 1, false, LocalDate.of(2005, 5, 21), 456f);

        GoodCoaster.readGoodData();

        for (RollerCoaster eachCoaster: RollerCoaster.getCoastersList()){
            System.out.println(eachCoaster);
        }
    }
}
