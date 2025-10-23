import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GoodCoaster extends RollerCoaster {
    private float rating;
    private String country;
    private String manufacturer;
    private int duels;

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getDuels() {
        return duels;
    }

    public void setDuels(int duels) {
        this.duels = duels;
    }

    public GoodCoaster(String name, String park, int rank, float rating, String country, String manufacturer, int duels) {
        super(name, park, rank);
        this.rating = rating;
        this.country = country;
        this.manufacturer = manufacturer;
        this.duels = duels;

        goodCoasters.add(this);
    }

    private static ArrayList<GoodCoaster> goodCoasters = new ArrayList<>();

    public static ArrayList<GoodCoaster> getGoodCoasters() {
        return goodCoasters;
    }

    public static void setGoodCoasters(ArrayList<GoodCoaster> goodCoasters) {
        GoodCoaster.goodCoasters = goodCoasters;
    }

    public static void readGoodData() throws Exception{
        File coasterData = new File("GoodCoasterData");
        Scanner dataScanner = new Scanner(coasterData);
        String data = "";
        Scanner lineScanner = new Scanner(data);


        while(dataScanner.hasNextLine()){

            data = dataScanner.nextLine();
            String name = data;
            data = dataScanner.nextLine();

            int rankEnds = data.indexOf(" ");

            System.out.println(rankEnds);

            System.out.println(data);
        }

        for (int i=0;i<0;i+=1){


            int rank = 1;
            String name = "steelVengeance";
            String park = "Cedar Point";
            float rating = 100;
            String country = "United States";
            String manufacturer = "Rocky Mountain Construction";
            int duels = 1800;
            new GoodCoaster(name, park, rank, rating, country, manufacturer, duels);
        }

    }

    public String toString(){
        return name+ " at "+park+" in "+ country +" is ranked the #"+rank +" best coaster with a rating of " +rating;
    }
}
