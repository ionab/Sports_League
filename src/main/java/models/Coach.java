package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "coaches")

public class Coach extends Member {

    private String qualification;
    private Club club;
    private Set<Team> teams;

    public Coach() {
    }

    public Coach(String name, int registration_number, boolean indoor, boolean beach, RefereeQual refereeQual, String qualification, Club club, Set<Team> teams) {
        super(name, registration_number, indoor, beach, refereeQual);
        this.qualification = qualification;
        this.club = club;
        this.teams = teams;
    }


    @Column(name = "qualification")
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


    @ManyToOne
    @JoinColumn(name = "coach_id", nullable = false )
    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }


    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "team_coach",
            joinColumns = {@JoinColumn(name = "team_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn (name ="coach_id", nullable = false, updatable = false)}
    )
    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    public void addTeam(Team team){
        this.teams.add(team);
    }
}
