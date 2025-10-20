import java.time.LocalDate;
import java.util.ArrayList;

 class TallCoaster extends RollerCoaster {
    private boolean operating;
    private LocalDate opened;
    private Float height;

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public LocalDate getOpened() {
        return opened;
    }

    public void setOpened(LocalDate opened) {
        this.opened = opened;
    }

    public TallCoaster(String name, String park, int rank, boolean operating, LocalDate opened, Float height) {
        super(name, park, rank);
        this.operating = operating;
        this.opened = opened;
        this.height = height;
        tallCoastersList.add(this);

        }
     static ArrayList<TallCoaster> tallCoastersList = new ArrayList<TallCoaster>();


     static public ArrayList<TallCoaster> getTallcoastersList() {
         return tallCoastersList;
     }

     static public void setTallcoastersList(ArrayList<TallCoaster> tallcoastersList) {
         tallCoastersList = tallcoastersList;
     }

     public String toString() {
return name + " located at " + park + " the rank is number " + rank + " is " + operating + " the " + height + " when it open "+ opened;
    }

}



