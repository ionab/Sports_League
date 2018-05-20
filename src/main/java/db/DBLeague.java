package db;

import models.League;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import java.util.List;

public class DBLeague {

   private static Session session;

   public static List<Team> getLeagueTable(League league){
       session = HibernateUtil.getSessionFactory().openSession();
       List<Team> sortedTeams = null;
       try {
           Criteria cr = session.createCriteria(Team.class);
           cr.addOrder(Order.desc("points"));
           sortedTeams = cr.list();
       } catch(HibernateException e){
           e.printStackTrace();
       } finally {
           session.close();
       } return sortedTeams;
   }

}
