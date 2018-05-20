package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "team")

public class Team {
    private String team_name;
    private Set<Player> players;
    private Set<Coach> coaches;
    private Club club;
    private League league;
    private int points;
    private int wins;
    private int losses;
    private int id;
    private Set<Game> games;

    public Team() {
    }
   

    public Team(String team_name, Club club, League league, int points, int wins, int losses) {
        this.team_name = team_name;
        this.players = new HashSet<Player>();
        this.coaches = new HashSet<Coach>();
        this.club = club;
        this.league = league;
        this.points = points;
        this.wins = wins;
        this.losses = losses;
        this.id = id;
        this.games = new HashSet<Game>();
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

    @Column(name = "team_name")
    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }
    
    @OneToMany(mappedBy = "team")
    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "team_coach",
            inverseJoinColumns = {@JoinColumn(name = "team_id", nullable = false, updatable = false)},
            joinColumns = {@JoinColumn (name ="coach_id", nullable = false, updatable = false)}
    )
    public Set<Coach> getCoaches() {
        return coaches;
    }

    public void setCoaches(Set<Coach> coaches) {
        this.coaches = coaches;
    }
    @ManyToOne
    @JoinColumn(name = "club_id", nullable = false )
    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    //    What we're doing here we had to do manually in Ruby. We're asking IntelliJi to
    //    to set up a row in the table. If we leave the Join column, it will set up the
    //    database with a column called the property, but you want to over write firstName to
    //    first_name etc.
    //    Below, we set up a column which will have a id relating to the primary key of the relational table
    //    determined by the getter immediately after it.


    @ManyToOne
    @JoinColumn(name = "teams", nullable = false )
    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
    @Column(name = "points")
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    @Column(name = "wins")
    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
    @Column(name = "losses")
    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false )
    public Set<Game> getGames() {
        return games;
    }

    public void setGames(Set<Game> games) {
        this.games = games;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }
    public void addGame(Game game){
        this.games.add(game);
    }

    public void addCoach(Coach coach){
        this.coaches.add(coach);
    }

    public void add3nilor3_1Win(){
        this.wins += 1;
        this.points += 3;
    }

    public void add3_2Win(){
        this.wins +=1;
        this.points +=2;
    }
    public void add3nilor3_oneLoss(){
        this.losses += 1;
    }
    public void add3_2Loss(){
        this.losses +=1;
        this.points +=1;
    }

}
