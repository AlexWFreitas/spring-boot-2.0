package com.frankmoley.lil.sbet.landon.roomwebapp.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="Employee")
public class StaffMember {
    @Id
    @Column(name="EMPLOYEE_ID")
    private String employeeId;
    @Column(name="FIRST_NAME")
    private String lastName;
    @Column(name="LAST_NAME")
    private String firstName;
    @Column(name="POSITION")
    @Enumerated(EnumType.STRING)
    private Position position;

    public StaffMember() {
        this.employeeId = UUID.randomUUID().toString();
    }

    public StaffMember(String employeeId, String lastName, String firstName, Position position) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String id) {
        this.employeeId = id;
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
