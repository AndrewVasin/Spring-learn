package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private final List<String> playList = new ArrayList<>(
            Arrays.asList("Hungarian Rhapsody",
                          "In The Hall of the Mountain King",
                          "Flight of the Bumble-Bee"));
    @Override
    public List<String> getSong() {
        return playList;
    }
}
