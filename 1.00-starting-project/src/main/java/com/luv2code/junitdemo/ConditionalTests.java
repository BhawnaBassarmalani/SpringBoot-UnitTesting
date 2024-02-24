package com.luv2code.junitdemo;

import jdk.jfr.Enabled;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTests {
    @Test
    @Disabled("Dont run until fixed")
    void basicTest(){
        // execute method and perform assertions
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForWindowsOnly(){

    }
}
