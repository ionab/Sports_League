package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "teams")

public class Club {
    private Set<Coach> coaches;
    private Set<Player> players;
    private Set<Team> teams;
//    private Board board;
    private String constitution;
    private int id;

    public Club() {
    }

    public Club(String constitution) {
        this.coaches = new HashSet<Coach>();
        this.players = new HashSet<Player>();
        this.teams = new HashSet<Team>();
//        this.board = board;
        this.constitution = constitution;
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

    @OneToMany(mappedBy = "club")
    public Set<Coach> getCoaches() {
        return coaches;
    }

    public void setCoaches(Set<Coach> coaches) {
        this.coaches = coaches;
    }
    @OneToMany(mappedBy = "club")
    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
    @OneToMany(mappedBy = "club")
    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }
//    @OneToOne(cascade = CascadeType.PERSIST)
//    public Board getBoard() {
//        return board;
//    }
//
//    public void setBoard(Board board) {
//        this.board = board;
//    }
    @Column(name = "constitution")
    public String getConstitution() {
        return constitution;
    }

    public void setConstitution(String constitution) {
        this.constitution = constitution;
    }

    public void addCoach(Coach coach){
        this.coaches.add(coach);
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void addTeam(Team team){
        this.teams.add(team);
    }

}
