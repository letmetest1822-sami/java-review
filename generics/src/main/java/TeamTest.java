public class TeamTest {

    public static void main(String[] args) {

        FootbalPlayer joe = new FootbalPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer bac = new SoccerPlayer("Bac");

        Team liverPool = new Team("Lieverpool");

        liverPool.addPlayer(joe);
        liverPool.addPlayer(pat);
        liverPool.addPlayer(bac);
        System.out.println(liverPool.numPlayers());

    }
}
