package com.example.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JTest {

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll - called once before all tests");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach - called before every test");
    }

    @DisplayName("Single test successful")
    @Test
    void myTest() {
        System.out.println("This is my test");
    }

    @Test
    @Disabled("Not implemented yet")
    void myTest1() {
        System.out.println("This is my test1");
    }

}
