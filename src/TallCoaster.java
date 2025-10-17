import java.time.LocalDate;

public class TallCoaster extends RollerCoaster {
    boolean operating;
    LocalDate opened;
    Float height;

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


        }
    public String toString() {
return name + " the " + park + " the rank is number " + rank + " is " + operating + " the " + height + " when it open "+ opened;
    }

}



