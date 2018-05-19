package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "teams")

public class Club {
    private Set<Coach> coaches;
    private Set<Player> player;
    private Set<Team> teams;
    private Board board;
    private String constitution;
    private int id;

    public Club() {
    }

    public Club(Set<Coach> coaches, Set<Player> player, Set<Team> teams, Board board, String constitution) {
        this.coaches = coaches;
        this.player = player;
        this.teams = teams;
        this.board = board;
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
    public Set<Player> getPlayer() {
        return player;
    }

    public void setPlayer(Set<Player> player) {
        this.player = player;
    }
    @OneToMany(mappedBy = "club")
    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }
    @OneToMany(mappedBy = "club")
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
    @Column(name = "constitution")
    public String getConstitution() {
        return constitution;
    }

    public void setConstitution(String constitution) {
        this.constitution = constitution;
    }
}
