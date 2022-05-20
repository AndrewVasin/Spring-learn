package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2,
                       @Qualifier("folkMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(MusicGenres genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (genre) {
            case CLASSICAL:
                return "Playing: " + music2.getSong().get(randomNumber);
            case ROCK:
                return "Playing: " + music1.getSong().get(randomNumber);
            case FOLK:
                return "Playing: " + music3.getSong().get(randomNumber);
        }
        return "Something wrong";
    }
}
