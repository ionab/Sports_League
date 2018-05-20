package models;

import javax.persistence.*;
import java.util.GregorianCalendar;

@Entity
@Table(name = "games")

public class Game {
    private int id;
    private GregorianCalendar date;
    private League league;
    private Team hometeam;
    private Team awayteam;

    public Game() {
    }

    public Game(GregorianCalendar date, League league, Team hometeam, Team awayteam) {
        this.date = date;
        this.league = league;
        this.hometeam = hometeam;
        this.awayteam = awayteam;
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
    @JoinColumn(name= "hometeam_id", nullable = false)
    public Team getHometeam() {
        return hometeam;
    }

    public void setHometeam(Team hometeam) {
        this.hometeam = hometeam;
    }
    @ManyToOne
    @JoinColumn(name= "awayteam_id", nullable = false)
    public Team getAwayteam() {
        return awayteam;
    }

    public void setAwayteam(Team awayteam) {
        this.awayteam = awayteam;
    }

    public void addResult(int hometeam_score, int awayteam_score){
        if (hometeam_score == 3 & awayteam_score < 2 ){
            hometeam.add3nilor3_1Win();
            awayteam.add3nilor3_oneLoss();
        } if (hometeam_score ==3 & awayteam_score ==2){
            hometeam.add3_2Win();
            awayteam.add3_2Loss();
        } if (hometeam_score < 2 & awayteam_score ==3){
            awayteam.add3nilor3_1Win();
            hometeam.add3nilor3_oneLoss();
        } if (hometeam_score ==2 & awayteam_score ==3){
            awayteam.add3_2Win();
            hometeam.add3_2Loss();
        }
    }
}
