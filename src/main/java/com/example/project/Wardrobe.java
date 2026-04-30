package com.example.project;

public class Wardrobe {

    public Wardrobe(int totalLength) {
        int wallSize = 250;
        if (totalLength > wallSize) {
            throw new IllegalArgumentException("Wardobe is longer than wall");
        }
    }
    

}
