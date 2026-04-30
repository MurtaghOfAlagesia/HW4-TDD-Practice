package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;

class WardrobeTest {

    @Disabled
    @Test
    void testWardrobeLargerThan250ThrowsException() {
        assertThrows(IllegalArgumentException.class, 
            () -> {new Wardrobe(300); },
            "Wardrobe too large for wall does not raise exception");
        };

    @Disabled
    @Test
    void testElementsSumTo250() {
        Wardrobe wardrobe = new Wardrobe(250);
        var combinations = wardrobe.getCombinations();
    };
        
}

