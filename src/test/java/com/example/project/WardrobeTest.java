package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;

class WardrobeTest {

    @Test
    void testWardrobeLargerThanWallThrowsException() {
        assertThrows(IllegalArgumentException.class, 
            () -> {new Wardrobe(300); },
            "Wardrobe too large for wall does not raise exception");
        };

    @Test
    void testElementsSumToWallLength() {
        Wardrobe wardrobe = new Wardrobe(250);
        var combinations = wardrobe.getValidElementCombinations();
        for (var combo : combinations) {
        int sum = combo.stream().mapToInt(Integer::intValue).sum();
        assertEquals(250, sum);
        };
    }

    @Test
    void testNonEmptyCombinations() {
    Wardrobe wardrobe = new Wardrobe(250);
    var combinations = wardrobe.getValidElementCombinations();
    }
}

