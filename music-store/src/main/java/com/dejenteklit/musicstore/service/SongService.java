/*
package com.dejenteklit.musicstore.service;
import com.dejenteklit.musicstore.model.Song;
import com.dejenteklit.musicstore.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SongService {
    private final SongRepository songRepository;

    @Autowired
    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> getSongs() {
        return songRepository.findAll();
    }

    public void addNewSong(Song song) {
        Optional<Song> songOptional = songRepository.findSongByTitle(song.getTitle());
        if (songOptional.isPresent()) {
            throw new IllegalStateException("Song with title '" + song.getTitle() + "' already exists");
        }
        songRepository.save(song);
    }

    public void deleteSong(Long songId) {
        boolean exists = songRepository.existsById(songId);
        if (!exists) {
            throw new IllegalStateException("Song with id " + songId + " does not exist");
        }
        songRepository.deleteById(songId);
    }
    public void updateSong(Long songId, String title, Artist artist) {
        Song song = songRepository.findById(songId)
                .orElseThrow(() -> new IllegalStateException("Song with id " + songId + " does not exist"));

        if (title != null && !Objects.equals(song.getTitle(), title)) {
            Optional<Song> songOptional = songRepository.findSongByTitle(title);
            if (songOptional.isPresent()) {
                throw new IllegalStateException("Song with title '" + title + "' already exists");
            }
            song.setTitle(title);
        }

        if (artist != null && !Objects.equals(song.getArtist(), artist)) {
            song.setArtist(artist);
        }
    }


    */
/*public void updateSong(Long songId, String title, String artist) {
        Song song = songRepository.findById(songId)
                .orElseThrow(() -> new IllegalStateException("Song with id " + songId + " does not exist"));

        if (title != null && !Objects.equals(song.getTitle(), title)) {
            Optional<Song> songOptional = songRepository.findSongByTitle(title);
            if (songOptional.isPresent()) {
                throw new IllegalStateException("Song with title '" + title + "' already exists");
            }
            song.setTitle(title);
        }

        if (artist != null && !Objects.equals(song.getArtist(), artist)) {
            song.setArtist(artist);
        }*//*

    }

*/
package com.dejenteklit.musicstore.service;

import com.dejenteklit.musicstore.model.Artist;
import com.dejenteklit.musicstore.model.Song;
import com.dejenteklit.musicstore.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SongService {
    private final SongRepository songRepository;

    @Autowired
    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> getSongs() {
        return songRepository.findAll();
    }

    public void addNewSong(Song song) {
        Optional<Song> songOptional = songRepository.findSongByTitle(song.getTitle());
        if (songOptional.isPresent()) {
            throw new IllegalStateException("Song with title '" + song.getTitle() + "' already exists");
        }
        songRepository.save(song);
    }

    public void deleteSong(Long songId) {
        boolean exists = songRepository.existsById(songId);
        if (!exists) {
            throw new IllegalStateException("Song with id " + songId + " does not exist");
        }
        songRepository.deleteById(songId);
    }

    public void updateSong(Long songId, String title, Artist artist) {
        Song song = songRepository.findById(songId)
                .orElseThrow(() -> new IllegalStateException("Song with id " + songId + " does not exist"));

        if (title != null && !Objects.equals(song.getTitle(), title)) {
            Optional<Song> songOptional = songRepository.findSongByTitle(title);
            if (songOptional.isPresent()) {
                throw new IllegalStateException("Song with title '" + title + "' already exists");
            }
            song.setTitle(title);
        }

        if (artist != null && !Objects.equals(song.getArtist(), artist)) {
            song.setArtist(artist);
        }
    }
}
