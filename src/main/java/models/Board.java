package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "boards")

public class Board {
    private Member chairperson;
    private Member vice_chairperson;
    private Member secretary;
    private Member treasurer;
    private Set<Member> social;
    private Set<Member> social_media;
    private Member child_protection_officer;
    private Member fundraiser;
    private Club club;
    private int id;

    public Board() {
    }

    public Board(Member chairperson, Member vice_chairperson, Member secretary, Member treasurer, Member child_protection_officer, Member fundraiser) {
        this.chairperson = chairperson;
        this.vice_chairperson = vice_chairperson;
        this.secretary = secretary;
        this.treasurer = treasurer;
        this.social = new HashSet<Member>();
        this.social_media = new HashSet<Member>();
        this.child_protection_officer = child_protection_officer;
        this.fundraiser = fundraiser;
        this.club = club;
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
    @OneToOne(mappedBy = "board", cascade = CascadeType.PERSIST)
    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    @Column(name = "chairperson")
    public Member getChairperson() {
        return chairperson;
    }

    public void setChairperson(Member chairperson) {
        this.chairperson = chairperson;
    }
    @Column(name = "vice_chairperson")
    public Member getVice_chairperson() {
        return vice_chairperson;
    }

    public void setVice_chairperson(Member vice_chairperson) {
        this.vice_chairperson = vice_chairperson;
    }
    @Column(name = "secretary")
    public Member getSecretary() {
        return secretary;
    }

    public void setSecretary(Member secretary) {
        this.secretary = secretary;
    }

    @Column(name = "treasurer")
    public Member getTreasurer() {
        return treasurer;
    }

    public void setTreasurer(Member treasurer) {
        this.treasurer = treasurer;
    }
    @Column(name = "social")
    public Set<Member> getSocial() {
        return social;
    }

    public void setSocial(Set<Member> social) {
        this.social = social;
    }
    @Column(name = "social_media")
    public Set<Member> getSocial_media() {
        return social_media;
    }

    public void setSocial_media(Set<Member> social_media) {
        this.social_media = social_media;
    }
    @Column(name = "child_protection_officer")
    public Member getChild_protecion_officer() {
        return child_protection_officer;
    }

    public void setChild_protecion_officer(Member child_protection_officer) {
        this.child_protection_officer = child_protection_officer;
    }
    @Column(name ="fundraiser")
    public Member getFundraiser() {
        return fundraiser;
    }

    public void setFundraiser(Member fundraiser) {
        this.fundraiser = fundraiser;
    }
}
