package models;

import java.util.Set;

public class Board {
    private Member chairperson;
    private Member vice_chairperson;
    private Member secretary;
    private Member treasurer;
    private Set<Member> social;
    private Set<Member> social_media;
    private Member child_protecion_officer;
    private Member fundraiser;

    public Board(Member chairperson, Member vice_chairperson, Member secretary, Member treasurer, Set<Member> social, Set<Member> social_media, Member child_protecion_officer, Member fundraiser) {
        this.chairperson = chairperson;
        this.vice_chairperson = vice_chairperson;
        this.secretary = secretary;
        this.treasurer = treasurer;
        this.social = social;
        this.social_media = social_media;
        this.child_protecion_officer = child_protecion_officer;
        this.fundraiser = fundraiser;
    }


    public Member getChairperson() {
        return chairperson;
    }

    public void setChairperson(Member chairperson) {
        this.chairperson = chairperson;
    }

    public Member getVice_chairperson() {
        return vice_chairperson;
    }

    public void setVice_chairperson(Member vice_chairperson) {
        this.vice_chairperson = vice_chairperson;
    }

    public Member getSecretary() {
        return secretary;
    }

    public void setSecretary(Member secretary) {
        this.secretary = secretary;
    }

    public Member getTreasurer() {
        return treasurer;
    }

    public void setTreasurer(Member treasurer) {
        this.treasurer = treasurer;
    }

    public Set<Member> getSocial() {
        return social;
    }

    public void setSocial(Set<Member> social) {
        this.social = social;
    }

    public Set<Member> getSocial_media() {
        return social_media;
    }

    public void setSocial_media(Set<Member> social_media) {
        this.social_media = social_media;
    }

    public Member getChild_protecion_officer() {
        return child_protecion_officer;
    }

    public void setChild_protecion_officer(Member child_protecion_officer) {
        this.child_protecion_officer = child_protecion_officer;
    }

    public Member getFundraiser() {
        return fundraiser;
    }

    public void setFundraiser(Member fundraiser) {
        this.fundraiser = fundraiser;
    }
}
