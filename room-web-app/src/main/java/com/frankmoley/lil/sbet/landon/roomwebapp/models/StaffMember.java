package com.frankmoley.lil.sbet.landon.roomwebapp.models;

public class StaffMember {
    private String id;
    private String lastName;
    private String firstName;
    private Position position;

    public StaffMember(String id, String lastName, String firstName, Position position) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
