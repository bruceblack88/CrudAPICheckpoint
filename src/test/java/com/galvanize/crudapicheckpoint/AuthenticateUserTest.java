package com.galvanize.crudapicheckpoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthenticateUserTest {

    @Test
    void checkThisClass () {
        AuthenticateUser authentication = new AuthenticateUser(false);
        assertEquals(false, authentication.isAuthenticated());
    }
}
