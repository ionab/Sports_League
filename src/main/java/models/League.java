package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "leagues")

public class League {
    private Set<Team> teams;
    private LeagueType leagueType;
    private int id;

    public League() {

    }

    public League(Set<Team> teams, LeagueType leagueType) {
        this.teams = teams;
        this.leagueType = leagueType;
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
    @OneToOne(mappedBy = "league")
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

    public void setLeagueType(LeagueType leagueType) {
        this.leagueType = leagueType;
    }
}
