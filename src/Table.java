import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ares on 2/7/2017.
 */
public class Table {
    //variables
    private int tableNumber;
    private int seats;
    private boolean occupied = false;
    private List<Table> tables;

    //constructor
    public Table(int tabelNumber, int seats, boolean occupied) {
        this.tableNumber = tabelNumber;
        this.seats = seats;
        this.occupied = occupied;
        tables = new ArrayList<Table>();
    }

    //gets data about tables from file
    public void producer() {}

    //checks if certain table is occupied
    public boolean getIsOccupied(int tableNumber) {}

    //setter
    public void setIsOccupied(int tableNumber) {}
}