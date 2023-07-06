package com.dejenteklit.musicstore.service.impl;

import java.util.List;
import com.dejenteklit.musicstore.repository.SongRepository;
import com.dejenteklit.musicstore.service.SongService;
import org.springframework.stereotype.Service;
import com.dejenteklit.musicstore.entity.Song;

@Service
public class SongServiceImpl implements SongService {

    private SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        super();
        this.songRepository = songRepository;
    }

    @Override
    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    @Override
    public Song saveSong(Song song) {
        return songRepository.save(song);
    }

    @Override
    public Song getSongById(Long id) {
        return songRepository.findById(id).orElse(null);
    }

    @Override
    public Song updateSong(Song song) {
        return songRepository.save(song);
    }

    @Override
    public void deleteSongById(Long id) {
        songRepository.deleteById(id);
    }

}
