package models;

import java.util.Set;

public class Club {
    private Set<Coach> coaches;
    private Set<Player> player;
    private Set<Team> teams;
    private Board board;
    private String constitution;

    public Club() {
    }

    public Club(Set<Coach> coaches, Set<Player> player, Set<Team> teams, Board board, String constitution) {
        this.coaches = coaches;
        this.player = player;
        this.teams = teams;
        this.board = board;
        this.constitution = constitution;
    }


    public Set<Coach> getCoaches() {
        return coaches;
    }

    public void setCoaches(Set<Coach> coaches) {
        this.coaches = coaches;
    }

    public Set<Player> getPlayer() {
        return player;
    }

    public void setPlayer(Set<Player> player) {
        this.player = player;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public String getConstitution() {
        return constitution;
    }

    public void setConstitution(String constitution) {
        this.constitution = constitution;
    }
}
