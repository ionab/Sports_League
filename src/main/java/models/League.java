package models;

import java.util.Set;

public class League {
    private Set<Team> teams;
    private LeagueType leagueType;

    public League() {

    }

    public League(Set<Team> teams, LeagueType leagueType) {
        this.teams = teams;
        this.leagueType = leagueType;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    public LeagueType getLeagueType() {
        return leagueType;
    }

    public void setLeagueType(LeagueType leagueType) {
        this.leagueType = leagueType;
    }
}
