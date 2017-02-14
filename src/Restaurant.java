import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ares on 2/7/2017.
 */
public class Restaurant {
    private String name;
    List<Servers> serverList;
    List<Table> tableList;

    public Restaurant(String name, ArrayList<Servers>, ArrayList<Table>) {
        this.name = name;
    }

    //adders
    public boolean addServer(Servers server) {
        if (server != null && server instanceof Servers) {
            Servers s = new Servers();
            return true;
        }
        return false;
    }

    public boolean addTable(Table table) {
        if (table != null && table instanceof Table) {
            Table t = new Table();
            return true;
        }
        return false;
    }

    public boolean addParty(Party party) {
        if (party != null && party instanceof Party) {
            Party p = new Party(party.getName(), party.getPartySize());
            return true;
        }
        return false;
    }

    //remove items
    public boolean removeServer(Servers server) {}

    public boolean removeTable(Table table) {}

    public boolean removeParty(Party party) {}

    //getters
    public String getName() {return this.name;}


}
