import db.DBHelper;
import models.*;

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
        Team women2 = new Team("Womens II", su_ragazzi, w_division2, 0, 0, 0, 0);

        //saves team to the database
        DBHelper.save(women2);

        //news up players in team to seed database.
        Player player1 = new Player("testname1", 1, true, true, models.RefereeQual.LEVEL2, Position.MIDDLE_BLOCKER, true, su_ragazzi, women2);
        Player player2 = new Player("testname1", 2, true, true, models.RefereeQual.LEVEL1, Position.MIDDLE_BLOCKER, false, su_ragazzi, women2);
        Player player3 = new Player("testname1", 3, true, true, models.RefereeQual.LEVEL4, Position.SETTER, false, su_ragazzi, women2);
        Player player4 = new Player("testname1", 4, true, true, models.RefereeQual.LEVEL4, Position.LIBERO, false, su_ragazzi, women2);
        Player player5 = new Player("testname1", 5, true, true, models.RefereeQual.LEVEL4, Position.SWING, false, su_ragazzi, women2);
        Player player6 = new Player("testname1", 6, true, true, models.RefereeQual.LEVEL4, Position.SWING, false, su_ragazzi, women2);
        Player player7 = new Player("testname1", 7, true, true, models.RefereeQual.LEVEL4, Position.OFFSETTER, false, su_ragazzi, women2);
        Player player8 = new Player("testname1", 8, true, true, models.RefereeQual.LEVEL4, Position.OFFSETTER, false, su_ragazzi, women2);
        Player player9 = new Player("testname1", 9, true, true, models.RefereeQual.LEVEL4, Position.POWER, false, su_ragazzi, women2);

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




    }
}
