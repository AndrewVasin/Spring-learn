package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FolkMusic implements Music {
    private final List<String> playList = new ArrayList<>(
            Arrays.asList("Finnegan's Wake",
                          "Drunken Sailor",
                          "Bonny Ship the Diamond"));

    @Override
    public List<String> getSong() {
        return playList;
    }
}
