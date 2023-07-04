
package com.dejenteklit.musicstore.controller;

import ch.qos.logback.core.model.Model;
import com.dejenteklit.musicstore.model.Artist;
import com.dejenteklit.musicstore.model.Song;
import com.dejenteklit.musicstore.repository.ArtistRepository;
import com.dejenteklit.musicstore.repository.SongRepository;
/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")*/
/*
public class MusicController {

    private final ArtistRepository artistRepository;
    private final SongRepository songRepository;
    @Autowired
    public MusicController(ArtistRepository artistRepository, SongRepository songRepository) {
        this.artistRepository = artistRepository;
        this.songRepository = songRepository;
    }

    @GetMapping("/artists")
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    @GetMapping("/songs")
    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }
}


*/
import com.dejenteklit.musicstore.service.ArtistService;
import com.dejenteklit.musicstore.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MusicController {

    private final ArtistService artistService;
    private final SongService songService;

    @Autowired
    public MusicController(ArtistService artistService, SongService songService) {
        this.artistService = artistService;
        this.songService = songService;
    }

    // Artists

    @GetMapping("/artists")
    public List<Artist> getAllArtists() {
        return artistService.getArtists();
    }

    @PostMapping("/artists")
    public void addNewArtist(@RequestBody Artist artist) {
        artistService.addNewArtist(artist);
    }

    @DeleteMapping("/artists/{artistId}")
    public void deleteArtist(@PathVariable("artistId") Long artistId) {
        artistService.deleteArtist(artistId);
    }

    @PutMapping("/artists/{artistId}")
    public void updateArtist(
            @PathVariable("artistId") Long artistId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        artistService.updateArtist(artistId, name, email);
    }

    // Songs

    @GetMapping("/songs")
    /*public List<Song> getAllSongs() {
        return songService.getSongs();
    }*/
    public ResponseEntity<List<Song>> getAllSongs() {
        List<Song> songs = songService.getSongs();
        return ResponseEntity.ok(songs);
    }

    @PostMapping("/songs")
    public void addNewSong(@RequestBody Song song) {
        songService.addNewSong(song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") Long songId) {
        songService.deleteSong(songId);
    }

    @PutMapping("/songs/{songId}")
    public void updateSong(
            @PathVariable("songId") Long songId,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) Artist artist) {
        songService.updateSong(songId, title, artist);
    }

    // Add additional methods as needed
}

