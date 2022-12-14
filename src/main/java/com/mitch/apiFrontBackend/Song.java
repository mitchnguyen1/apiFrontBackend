package com.mitch.apiFrontBackend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Song {

    @Id
    @GeneratedValue
    private Integer id;
    private String songName;
    private String artist;

    public Song(Integer id, String songName, String artist) {
        this.id = id;
        this.songName = songName;
        this.artist = artist;
    }

    public Song(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", songName='" + songName + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
