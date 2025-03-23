package org.example.mysuperapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MySuperAppApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void exampleTest(){
        assertEquals(1, 1);
    }

}
