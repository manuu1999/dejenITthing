package com.dejenteklit.musicstore.service;

import com.dejenteklit.musicstore.entity.Song;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface SongService {
    List<Song> getAllSongs();

    Song saveSong(Song song, MultipartFile audioFile, MultipartFile albumArtFile);

    Song getSongById(Long id);

    Song updateSong(Song song);

    void deleteSongById(Long id);
}
