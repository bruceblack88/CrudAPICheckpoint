package com.galvanize.crudapicheckpoint;

public class UserQuery {
    private String email;
    private String password;

    public UserQuery(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UserQuery() {
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
}
