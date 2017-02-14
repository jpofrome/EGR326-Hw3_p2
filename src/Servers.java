/**
 * Created by Ares on 2/7/2017.
 */
public class Servers {
    //variables
    private int serverNum;
    private int numOfServers = 0;

    //constructor
    public Servers(int serverNum) {
        this.serverNum = serverNum;
        numOfServers++;
    }

    //assigns servers to tables
    public void assignToTable(Table table) {}

    //checks if employee is working or not
    public int numOfServers() {return numOfServers;}

    //getters
    public int getServerNum() {return serverNum;}

    @Override
    public String toString() {}
}
