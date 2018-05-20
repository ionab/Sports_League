import db.DBHelper;
import db.DBLeague;
import models.*;

import java.util.GregorianCalendar;

public class Runner {

    public static void main(String[] args) {


//        //news up members for the board.
//        Member member = new Member("testname", 1, true ,false, models.RefereeQual.LEVEL1);
//        Member member2 = new Member("testname", 1, true ,false, models.RefereeQual.LEVEL1);
//        Member member3 = new Member("testname", 1, true ,false, models.RefereeQual.LEVEL1);
//        Member member4 = new Member("testname", 1, true ,false, models.RefereeQual.LEVEL1);
//        Member member5 = new Member("testname", 1, true ,false, models.RefereeQual.LEVEL1);
//        Member member6 = new Member("testname", 1, true ,false, models.RefereeQual.LEVEL1);
//
//        //saves members to the database
//        DBHelper.save(member);
//        DBHelper.save(member2);
//        DBHelper.save(member3);
//        DBHelper.save(member4);
//        DBHelper.save(member5);
//        DBHelper.save(member6);

//        //news up board for the database.
//        Board board = new Board(member, member2, member3, member4, member5, member6);
//
//        //saves board to the database
//        DBHelper.save(board);

        //news up a club for the database.
        Club su_ragazzi = new Club("test_constitution");

        //saves club to the database.
        DBHelper.save(su_ragazzi);

        //news up a league.
        League w_division2 = new League(LeagueType.SVL_WOMENS2);

        //saves the league to the database.
        DBHelper.save(w_division2);

        //news up team to seed the database
        Team su_ragazzi_women2 = new Team("Su II", su_ragazzi, w_division2, 0, 0,  0);
        Team jetsw2 = new Team("Jets II", su_ragazzi, w_division2, 0, 0, 0);

        //saves team to the database
        DBHelper.save(su_ragazzi_women2);
        DBHelper.save(jetsw2);

        //news up players in team to seed database.
        Player player1 = new Player("testname1", 1, true, true, models.RefereeQual.LEVEL2, Position.MIDDLE_BLOCKER, true, su_ragazzi, su_ragazzi_women2);
        Player player2 = new Player("testname1", 2, true, true, models.RefereeQual.LEVEL1, Position.MIDDLE_BLOCKER, false, su_ragazzi, su_ragazzi_women2);
        Player player3 = new Player("testname1", 3, true, true, models.RefereeQual.LEVEL4, Position.SETTER, false, su_ragazzi, su_ragazzi_women2);
        Player player4 = new Player("testname1", 4, true, true, models.RefereeQual.LEVEL4, Position.LIBERO, false, su_ragazzi, su_ragazzi_women2);
        Player player5 = new Player("testname1", 5, true, true, models.RefereeQual.LEVEL4, Position.SWING, false, su_ragazzi, su_ragazzi_women2);
        Player player6 = new Player("testname1", 6, true, true, models.RefereeQual.LEVEL4, Position.SWING, false, su_ragazzi, su_ragazzi_women2);
        Player player7 = new Player("testname1", 7, true, true, models.RefereeQual.LEVEL4, Position.OFFSETTER, false, su_ragazzi, su_ragazzi_women2);
        Player player8 = new Player("testname1", 8, true, true, models.RefereeQual.LEVEL4, Position.OFFSETTER, false, su_ragazzi, su_ragazzi_women2);
        Player player9 = new Player("testname1", 9, true, true, models.RefereeQual.LEVEL4, Position.POWER, false, su_ragazzi, su_ragazzi_women2);


        //adds players to team
        su_ragazzi_women2.addPlayer(player1);
        su_ragazzi_women2.addPlayer(player2);
        su_ragazzi_women2.addPlayer(player3);
        su_ragazzi_women2.addPlayer(player4);
        su_ragazzi_women2.addPlayer(player5);
        su_ragazzi_women2.addPlayer(player6);
        su_ragazzi_women2.addPlayer(player7);
        su_ragazzi_women2.addPlayer(player8);
        su_ragazzi_women2.addPlayer(player9);

        //saves update to database.
        DBHelper.save(player1);
        DBHelper.save(player2);
        DBHelper.save(player3);
        DBHelper.save(player4);
        DBHelper.save(player5);
        DBHelper.save(player6);
        DBHelper.save(player7);
        DBHelper.save(player8);
        DBHelper.save(player9);

        //news up second set of players to add to another team
        //news up players in team to seed database.
        Player jetsplayer1 = new Player("testname1", 1, true, true, models.RefereeQual.LEVEL2, Position.MIDDLE_BLOCKER, true, su_ragazzi, jetsw2);
        Player jetsplayer2 = new Player("testname1", 2, true, true, models.RefereeQual.LEVEL1, Position.MIDDLE_BLOCKER, false, su_ragazzi, jetsw2);
        Player jetsplayer3 = new Player("testname1", 3, true, true, models.RefereeQual.LEVEL4, Position.SETTER, false, su_ragazzi, jetsw2);
        Player jetsplayer4 = new Player("testname1", 4, true, true, models.RefereeQual.LEVEL4, Position.LIBERO, false, su_ragazzi, jetsw2);
        Player jetsplayer5 = new Player("testname1", 5, true, true, models.RefereeQual.LEVEL4, Position.SWING, false, su_ragazzi, jetsw2);
        Player jetsplayer6 = new Player("testname1", 6, true, true, models.RefereeQual.LEVEL4, Position.SWING, false, su_ragazzi, jetsw2);
        Player jetsplayer7 = new Player("testname1", 7, true, true, models.RefereeQual.LEVEL4, Position.OFFSETTER, false, su_ragazzi, jetsw2);
        Player jetsplayer8 = new Player("testname1", 8, true, true, models.RefereeQual.LEVEL4, Position.OFFSETTER, false, su_ragazzi, jetsw2);
        Player jetsplayer9 = new Player("testname1", 9, true, true, models.RefereeQual.LEVEL4, Position.POWER, false, su_ragazzi, jetsw2);

        //adds players to other team
        jetsw2.addPlayer(jetsplayer1);
        jetsw2.addPlayer(jetsplayer2);
        jetsw2.addPlayer(jetsplayer3);
        jetsw2.addPlayer(jetsplayer4);
        jetsw2.addPlayer(jetsplayer5);
        jetsw2.addPlayer(jetsplayer6);
        jetsw2.addPlayer(jetsplayer7);
        jetsw2.addPlayer(jetsplayer8);
        jetsw2.addPlayer(jetsplayer9);

        //saves players to database.
        DBHelper.save(player1);
        DBHelper.save(player2);
        DBHelper.save(player3);
        DBHelper.save(player4);
        DBHelper.save(player5);
        DBHelper.save(player6);
        DBHelper.save(player7);
        DBHelper.save(player8);
        DBHelper.save(player9);

        w_division2.addTeam(jetsw2);
        w_division2.addTeam(su_ragazzi_women2);

        DBHelper.save(w_division2);

        Game game = new Game(new GregorianCalendar(2018, 4, 20), w_division2, su_ragazzi_women2, jetsw2);
        Game game2 = new Game(new GregorianCalendar(2018, 4, 20), w_division2, su_ragazzi_women2, jetsw2);
        Game game3 = new Game(new GregorianCalendar(2018, 4, 20), w_division2, su_ragazzi_women2, jetsw2);
        Game game4 = new Game(new GregorianCalendar(2018, 4, 20), w_division2, su_ragazzi_women2, jetsw2);

        DBHelper.save(game);
        DBHelper.save(game2);
        DBHelper.save(game3);
        DBHelper.save(game4);

        game.addResult(2, 3);
        game2.addResult(3, 0);
        game3.addResult(3, 0);
        game3.addResult(3, 0);
        DBHelper.save(game);
        DBHelper.save(game2);
        DBHelper.save(game3);
        DBHelper.save(game4);

        DBLeague.getLeagueTable(w_division2);

    }
}
