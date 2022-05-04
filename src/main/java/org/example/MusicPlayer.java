package org.example;

public class MusicPlayer {
    private Music musicList;
    private String name;
    private int volume;

    public Music getMusicList() {
        return musicList;
    }

    public void setMusicList(Music musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }

    public MusicPlayer(Music musicList) {
        this.musicList = musicList;
    }

    public void setMusic(Music musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
            System.out.println("Playing: " + musicList.getSong());
//            System.out.println("volume: " + getVolume());
//            System.out.println("name: " + getName());
    }
}
