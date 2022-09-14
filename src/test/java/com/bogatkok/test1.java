package com.bogatkok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test1 {
    @Test
    void testFirst(){
        Assertions.assertTrue(100 >= 1);
    }
    @Test
    void testSecond(){
        Assertions.assertTrue(100 >= 2);
    }
}
