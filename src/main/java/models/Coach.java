package models;

public class Coach extends Member {

    private String qualification;
    private Club club;
    private set<Team> teams;

    public Coach() {
    }

    public Coach(String name, int registration_number, boolean indoor, boolean beach, RefereeQual refereeQual, String qualification, Club club, set<Team> teams) {
        super(name, registration_number, indoor, beach, refereeQual);
        this.qualification = qualification;
        this.club = club;
        this.teams = teams;
    }


    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public set<Team> getTeams() {
        return teams;
    }

    public void setTeams(set<Team> teams) {
        this.teams = teams;
    }
}
