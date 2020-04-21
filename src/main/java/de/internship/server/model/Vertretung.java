package de.internship.server.model;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.*;

@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Table(name= "vertretung")
public class Vertretung {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int v_id;
    private int stunde;
    private String klasse;
    private String fach;
    private String lehrer;

    public Vertretung(){

    }

    public Vertretung (int stunde, String klasse, String fach, String lehrer) {
        this.stunde = stunde;
        this.klasse = klasse;
        this.fach = fach;
        this.lehrer = lehrer;
    }

    public int getV_id() {
        return v_id;
    }

    public void setV_id(int v_id) {
        this.v_id = v_id;
    }

    public int getStunde() {
        return stunde;
    }

    public void setStunde(int stunde) {
        this.stunde = stunde;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    public String getLehrer() {
        return lehrer;
    }

    public void setLehrer(String lehrer) {
        this.lehrer = lehrer;
    }
}


