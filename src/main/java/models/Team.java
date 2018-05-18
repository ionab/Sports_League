package models;

import java.util.Set;

public class Team {
    private String team_name;
    private Set<Player> players;
    private Set<Coach> coaches;
    private Club club;
    private League league;
    private int points;
    private int wins;
    private int losses;
    private int draws;

    public Team() {
    }


    public Team(String team_name, Set<Player> players, Set<Coach> coaches, Club club, League league, int points, int wins, int losses, int draws) {
        this.team_name = team_name;
        this.players = players;
        this.coaches = coaches;
        this.club = club;
        this.league = league;
        this.points = points;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }


    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public Set<Coach> getCoaches() {
        return coaches;
    }

    public void setCoaches(Set<Coach> coaches) {
        this.coaches = coaches;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }
}
