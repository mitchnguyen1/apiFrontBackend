package com.mitch.apiFrontBackend;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songs")
public class SongController {
    private final SongService songService;

    public SongController(SongService songService){
        this.songService = songService;
    }

    @CrossOrigin("*")
    @GetMapping
    public List<Song> getSongs(){
        return  songService.all();
    }

    @CrossOrigin("*")
    @PostMapping
    public void addSong(@RequestBody Song song){
        songService.add(song);
    }
}
