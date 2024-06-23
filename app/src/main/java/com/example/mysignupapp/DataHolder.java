package com.example.mysignupapp;

public class DataHolder {
    String name, email, password, phone;
    boolean check;

    public DataHolder(String name, String email, String password, String phone, boolean check) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
