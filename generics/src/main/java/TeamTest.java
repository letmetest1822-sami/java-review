import java.util.ArrayList;

public class TeamTest {

    public static void main(String[] args) {

        FootbalPlayer joe = new FootbalPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer bac = new SoccerPlayer("Bac");

        Team<SoccerPlayer> liverPool = new Team("Liverpool");

//        liverPool.addPlayer(joe); //Team<SoccerPlayer> prevented them to get in the team
//        liverPool.addPlayer(pat); //Team<SoccerPlayer> prevented them to get in the team
        liverPool.addPlayer(bac);
        System.out.println(liverPool.numPlayers());

//        Team<String> brokenTeam = new Team<>("This wont work");
    }
}
