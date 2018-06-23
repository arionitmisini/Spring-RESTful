package com.sample.springresth2.models;

public class Person {
    private int id;
    private String name;
    private String lastname;
    private char gender;
    private String ipAdress;

    public Person(int id, String name, String lastname, char gender, String ipAdress) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.ipAdress = ipAdress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }
}
