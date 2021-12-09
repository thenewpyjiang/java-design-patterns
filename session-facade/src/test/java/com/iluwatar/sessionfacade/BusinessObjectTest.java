package com.iluwatar.sessionfacade;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BusinessObjectTest {

    /**
     * Test for data object's generic functionality
     */
    @Test
    void DataObjectTest() {
        String target = "Verification";
        BusinessObject bo = new BusinessObject("Verification", Logger.getLogger("BO"));
        assertEquals(bo.getDataObject(), target);
    }

}
