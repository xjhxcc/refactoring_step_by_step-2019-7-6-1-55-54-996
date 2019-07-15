package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DriverTest {
    private static Driver driver;
    @BeforeAll
    public static void initBeforeFuc() {
        driver = new Driver();
    }

    @Test
    void should_return_true_when_call_checkDriver_given_18() {
        driver.setAge(18);
        boolean result = driver.isLegalDriver();
        Assertions.assertSame(true, result);
    }


    @Test
    void should_return_false_when_call_checkDriver_given_17() {
        driver.setAge(17);
        boolean result = driver.isLegalDriver();
        Assertions.assertSame(false, result);

    }


    @Test
    void should_return_true_when_call_checkDriver_given_19() {
        driver.setAge(19);
        boolean result = driver.isLegalDriver();
        Assertions.assertSame(true, result);
    }

}