package de.internship.server.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Login {

    // declaration
    private String schoolID;
    private String username;
    private String password;

    // getters and setters

    public Login() {
    }

    public Login(String schoolID, String username, String password) {
        this.schoolID = schoolID;
        this.username = username;
        this.password = password;
    }

    public String getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(String schoolID) {
        this.schoolID = schoolID;
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
}
