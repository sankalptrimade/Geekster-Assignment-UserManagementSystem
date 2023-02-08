package com.example.usermanagementsystem.model;

public class Management {
    private int userId;
    private String name;
    private String userName;
    private  String address;
    private long contact;

    Management(){

    }
    public Management(int userId, String name, String userName, String address, long contact) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.contact = contact;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Management{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                '}';
    }
}
