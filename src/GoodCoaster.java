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



    }

    public String ToString(){
        return name;
    }
}
