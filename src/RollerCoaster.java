public class RollerCoaster {
    String name;
    String park;
    int rank;

    public RollerCoaster(String name, String park, int rank) {
        this.name = name;
        this.park = park;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
