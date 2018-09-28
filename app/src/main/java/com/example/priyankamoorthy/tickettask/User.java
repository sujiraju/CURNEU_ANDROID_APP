package com.example.priyankamoorthy.tickettask;

public class User {

    public String usrid;
    public String name;
    public String email;


    public User() {
    }

    public User(String usrid, String name, String email) {
        this.usrid = usrid;
        this.name = name;
        this.email = email;
    }

    public String getUsrid() {
        return usrid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }



}
