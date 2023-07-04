/*
package com.dejenteklit.musicstore.controller;

import com.dejenteklit.musicstore.model.Artist;
import com.dejenteklit.musicstore.model.Song;
import com.dejenteklit.musicstore.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${com.dejenteklit.musicstore.song.path}")
public class SongController {
    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
    public List<Song> getSongs() {
        return songService.getSongs();
    }

    @PostMapping
    public void addNewSong(@RequestBody Song song) {
        songService.addNewSong(song);
    }

    @DeleteMapping(path = "{songId}")
    public void deleteSong(@PathVariable("songId") Long songId) {
        songService.deleteSong(songId);
    }

    @PutMapping(path = "{songId}")
    public void updateSong(
            @PathVariable("songId") Long songId,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) Artist artist) {
        songService.updateSong(songId, title, artist);
    }
}
*/
