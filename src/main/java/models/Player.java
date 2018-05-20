package models;

import javax.persistence.*;

@Entity
@Table(name = "players")

public class Player extends Member {

    private Position position;
    private boolean captain;
    private Club club;
    private Team team;
//    private int id;


    public Player(String name, int registration_number, boolean indoor, boolean beach, RefereeQual refereeQual, Position position, boolean captain, Club club, Team team) {
        super(name, registration_number, indoor, beach, refereeQual);
        this.position = position;
        this.captain = captain;
        this.club = club;
        this.team = team;
    }

    public Player() {
    }


    @Column(name = "position")
    @Enumerated(EnumType.STRING)
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Column(name = "captain")
    public boolean isCaptain() {
        return captain;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }
    @ManyToOne
    @JoinColumn(name = "club_id", nullable = false )
    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
