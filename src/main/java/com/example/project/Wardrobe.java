package com.example.project;

public class Wardrobe {

    public Wardrobe(int length) {
        if (length > 250) {
            throw new IllegalArgumentException("Wardobe is too big");
        }
    
    }

}
