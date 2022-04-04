package com.galvanize.crudapicheckpoint;

import com.fasterxml.jackson.annotation.JsonInclude;

public class AuthenticateUser {
    private boolean authenticated;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private User user;

    public AuthenticateUser(boolean authenticated, User user) {
        this.authenticated = authenticated;
        this.user = user;
    }

    public AuthenticateUser(boolean authenticated) {
        this.authenticated = authenticated;
        user = null;
    }

    public AuthenticateUser() {
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
