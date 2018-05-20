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
    @OneToMany(mappedBy = "games")
    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
    @OneToMany(mappedBy = "games")
    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }
    @OneToMany(mappedBy = "games")
    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }
}
