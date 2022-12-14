package com.mitch.apiFrontBackend;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {
    private final SongRepository songRepository;
    public SongService (SongRepository songRepository){
        this.songRepository = songRepository;
    }

    public List<Song> all() {
        return songRepository.findAll();}

    public void add(Song song) {
        songRepository.save(song);
    }
}
