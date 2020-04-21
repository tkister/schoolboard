package de.internship.server.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Table(name = "user_profile")
public class UserProfile {

    // declaration


    private String school_ID;
    @Id
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String gender;
    private int yearOfBirth;
    private int yearOfEntrance;

    // getters and setters

    public UserProfile() {
    }

    public UserProfile(String schoolID,String username, String password, String firstName, String lastName, String gender, int yearOfBirth, int yearOfEntrance) {
        this.school_ID = schoolID;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        this.yearOfEntrance= yearOfEntrance;
    }

    public String getSchoolID() {
        return school_ID;
    }

    public void setSchoolID(String schoolID) {
        this.school_ID = schoolID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfEntrance(){return yearOfEntrance;}
    public void setYearOfEntrance(int yearOfEntrance){this.yearOfEntrance = yearOfEntrance;}
}
