package com.dejenteklit.musicstore.service;
import com.dejenteklit.musicstore.entity.Song;
import java.util.List;
public interface SongService {
    List<Song> getAllSongs();

    Song saveSong(Song song);

    Song getSongById(Long id);

    Song updateSong(Song song);

    void deleteSongById(Long id);
}
