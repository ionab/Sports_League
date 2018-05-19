package models;


import javax.persistence.*;

@Entity
@Table(name = "members")

public class Member {
    private String name;
    private int registration_number;
    private boolean indoor;
    private boolean beach;
    private RefereeQual refereeQual;
    private int id;
  //TODO think about adding id

    public Member(String name, int registration_number, boolean indoor, boolean beach, RefereeQual refereeQual) {
        this.name = name;
        this.registration_number = registration_number;
        this.indoor = indoor;
        this.beach = beach;
        this.refereeQual = refereeQual;
        this.id = id;
    }

    public Member() {
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

    @Column(name ="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "registration_number")
    public int getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(int registration_number) {
        this.registration_number = registration_number;
    }

    @Column(name = "indoor")
    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }
    @Column(name = "beach")
    public boolean isBeach() {
        return beach;
    }

    public void setBeach(boolean beach) {
        this.beach = beach;
    }
    @Column(name = "referee_qual")
    @Enumerated(EnumType.STRING)
    public RefereeQual getRefereeQual() {
        return refereeQual;
    }

    public void setRefereeQual(RefereeQual refereeQual) {
        this.refereeQual = refereeQual;
    }
}
