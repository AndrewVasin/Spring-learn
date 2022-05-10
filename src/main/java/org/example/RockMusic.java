package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    private final List<String> playList = new ArrayList<>(
            Arrays.asList("Wind cries Mary",
                          "November rain",
                          "Paradise city"));

    @Override
    public List<String> getSong() {
        return playList;
    }
}
