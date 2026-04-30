package com.example.project;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {

    public Wardrobe(int totalLength) {
        int wallSize = 250;
        if (totalLength > wallSize) {
            throw new IllegalArgumentException("Wardobe is longer than wall");
        }
    }
    public List<List<Integer>> getValidElementCombinations() {
        return new ArrayList<>();
    }

}
