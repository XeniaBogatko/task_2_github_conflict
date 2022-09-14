package com.bogatkok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class test1 {
    @Test
    void testFirst(){
        Assertions.assertTrue(new Random().nextInt() > 1);
    }
    @Test
    void testSecond(){
        Assertions.assertTrue(new Random().nextInt() > 2);
    }
}
