package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WardrobeTest {

    @Test
    void wardrobeLargerThan250ThrowsException() {
        assertThrows(IllegalArgumentException.class, 
            () -> {new Wardrobe(300); },
            "Wardrobe too large for wall does not raise exception");
        };
    }

