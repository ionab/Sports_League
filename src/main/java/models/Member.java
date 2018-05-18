package models;

public class Member {
    private String name;
    private int registration_number;
    private boolean indoor;
    private boolean beach;
    private RefereeQual refereeQual;

    public Member(String name, int registration_number, boolean indoor, boolean beach, RefereeQual refereeQual) {
        this.name = name;
        this.registration_number = registration_number;
        this.indoor = indoor;
        this.beach = beach;
        this.refereeQual = refereeQual;
    }

    public Member() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(int registration_number) {
        this.registration_number = registration_number;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }

    public boolean isBeach() {
        return beach;
    }

    public void setBeach(boolean beach) {
        this.beach = beach;
    }

    public RefereeQual getRefereeQual() {
        return refereeQual;
    }

    public void setRefereeQual(RefereeQual refereeQual) {
        this.refereeQual = refereeQual;
    }
}
