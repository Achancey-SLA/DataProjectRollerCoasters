import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

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

    public static void readTallCoasterData() throws Exception{
      File myData = new File("TallCoasterData");
      Scanner myReader = new Scanner(myData);
      int currentRank = 1;
      while (myReader.hasNextLine()){
          String data = myReader.nextLine();


          //Kingda Ka	Six Flags Great Adventure	Steel	Sit Down	-	5/21/2005	456.0 ft

          Scanner lineScanner = new Scanner(data);
          lineScanner. useDelimiter("\t");

         /*
          String name = "Kingda Ka";
          String park = "Six Flags Great Adventure";
          int rank = 1;
          boolean operating = false;
          float height = 456F;
          LocalDate tallCoatserLocalDate = LocalDate.of(2005, 5,21);
          */
          String name = lineScanner.next();

          String park = lineScanner.next();

          int rank = currentRank;
          currentRank+=1;

          lineScanner.next();
          lineScanner.next();

          String operatingString = lineScanner.next();
          boolean operating;
          if(operatingString.equals("-")||operatingString.equals("SBNO")||operatingString.equals("Under Constrution")) {
              operating = false;

          }
          else{
              operating = true;
          }


          String dateString = lineScanner.next();
          int year = 0;
          int month = 1;
          int dayOfMonth = 1;
          if (dateString.contains("/")){
              int cutOffPoint = dateString.indexOf("/");
              month = Integer.parseInt(dateString.substring(0,cutOffPoint));
              dateString=dateString.substring(cutOffPoint+1);
              cutOffPoint = dateString.indexOf("/");
              dayOfMonth = Integer.parseInt(dateString.substring(0,cutOffPoint));
              dateString=dateString.substring(cutOffPoint+1);
              year = Integer.parseInt(dateString);
          }
          else{
              year = Integer.parseInt(dateString);
          }


          LocalDate tallCoatserLocalDate = LocalDate.of(year, month,dayOfMonth);


          String heightChunk = lineScanner.next();
          heightChunk = heightChunk.replace("ft","");
          float height = Float.parseFloat(heightChunk);
          new TallCoaster(name, park, rank, operating, tallCoatserLocalDate, height);

          //new TallCoaster("Kingda Ka", "Six Flags Great Adventure", 1, false, LocalDate.of(2005, 5, 21), 456f);
          //System.out.println(coaster1);
      }


    }


}



