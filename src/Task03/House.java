package Task03;
import java.time.Year;

public class House {

    private int floors;
    private int yearBuilt;
    private String name;

    public void setValues(int floors, int yearBuilt, String name) {
        this.floors = floors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }

    public void printValues() {
        System.out.println("Name: " + name + ", Floors: " + floors + ", Year Built: " + yearBuilt);
    }

    public int getYearsSinceBuilt() {
        return Year.now().getValue() - yearBuilt;

    }

}
