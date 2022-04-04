package com.galvanize.crudapicheckpoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserQueryTest {
    @Test
    void testingUserQueryClass() {

        UserQuery userQueryTest = new UserQuery("john@example.com","1234");
        assertEquals("1234", userQueryTest.getPassword());

    }
}
