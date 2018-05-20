package models;

import org.hibernate.annotations.CollectionOfElements;

import javax.persistence.*;
import java.util.GregorianCalendar;

@Entity
@Table(name = "games")

public class Game {
    private int id;
    private GregorianCalendar date;
    private League league;
    private Team teamA;
    private Team teamB;

    public Game() {
    }

    public Game(GregorianCalendar date, League league, Team teamA, Team teamB) {
        this.date = date;
        this.league = league;
        this.teamA = teamA;
        this.teamB = teamB;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "date")
    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }


    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
    @ManyToOne
    @JoinColumn(name= "team_id", nullable = false)
    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }
    @ManyToOne
    @JoinColumn(name= "team_id", nullable = false)
    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    public void addResult(int teamAScore, int teamBScore){
        if (teamAScore == 3 & teamBScore <= 2 ){
            teamA.add3nilor3_1Win();
            teamB.add3nilor3_oneLoss();
        } if (teamAScore ==3 & teamBScore ==2){
            teamA.add3_2Win();
            teamB.add3_2Loss();
        } if (teamAScore <= 2 & teamBScore ==3){
            teamB.add3nilor3_1Win();
            teamA.add3nilor3_oneLoss();
        } if (teamAScore ==2 & teamBScore ==3){
            teamB.add3_2Win();
            teamA.add3_2Loss();
        }
    }
}
