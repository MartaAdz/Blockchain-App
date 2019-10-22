package com.example.orderingplatform.Model;

public class User {
    private String address;
    private String password;

    public User(String address, String password) {
        this.address = address;
        this.password = password;
    }

    public User() {
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
