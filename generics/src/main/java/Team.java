import java.util.ArrayList;

public class Team<T extends Player> {  //There is no type check. All players can join.  ADD <type> Team<T>

    private String name;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(((Player)player).getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(((Player)player).getName() + " picked for team " + this.name);
            return true;
        }
    }
        public int numPlayers() {
            return this.members.size();
        }
}
