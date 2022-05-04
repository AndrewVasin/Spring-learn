package org.example;

import org.springframework.stereotype.Component;

@Component("myMusicPlayer")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
