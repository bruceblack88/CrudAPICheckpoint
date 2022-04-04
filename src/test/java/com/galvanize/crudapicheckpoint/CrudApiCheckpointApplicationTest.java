package com.galvanize.crudapicheckpoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrudApiCheckpointApplicationTest {
    @Test
    void checkCrudApiApplication(){
        CrudApiCheckpointApplication.main(new String[]{"1","2"});
    }

}