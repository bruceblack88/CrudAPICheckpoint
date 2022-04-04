package com.galvanize.crudapicheckpoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthenticateUserTest {

    @Test
    void checkThisClass () {
        AuthenticateUser authentication = new AuthenticateUser(false);
        assertEquals(false, authentication.isAuthenticated());
    }
    @Test
    void setAuthenticated(){
        AuthenticateUser testUser = new AuthenticateUser();
        testUser.setAuthenticated(false);
        testUser.setUser(new User("john@email.com", "123"));
        assertEquals(false, testUser.isAuthenticated());

    }
}
