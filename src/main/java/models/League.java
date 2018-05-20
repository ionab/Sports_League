package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "leagues")

public class League {
    private Set<Team> teams;
    private LeagueType leagueType;
    private int id;
    private Set<Game> games;

    public League() {

    }

    public League(LeagueType leagueType) {
        this.teams = new HashSet<Team>();
        this.leagueType = leagueType;
        this.games = new HashSet<Game>();
        this.id = id;
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

    //   Here we say we want a one to many relationship with the league's teams.
//    Adds a column to the database called teams which will have an id in the database
//    of the teams id. This id is the Id which is generated above. As it's the one to
//    many relationship and the one side, this can only be the id generated in this class.
//    This should match the name of what you've called the attribute of the teams class
//    where you've said the class has a league.

    @OneToMany(mappedBy = "league")
    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }
    @Enumerated(EnumType.STRING)
    public LeagueType getLeagueType() {
        return leagueType;
    }
    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false )
    public Set<Game> getGames() {
        return games;
    }

    public void setGames(Set<Game> games) {
        this.games = games;
    }

    public void setLeagueType(LeagueType leagueType) {
        this.leagueType = leagueType;
    }

    public void addTeam(Team team){
        this.teams.add(team);
    }

    public void addGame(Game game){
        this.games.add(game);
    }
}
