package com.dejenteklit.musicstore.service.impl;

import com.dejenteklit.musicstore.entity.Song;
import com.dejenteklit.musicstore.repository.SongRepository;
import com.dejenteklit.musicstore.service.SongService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Collections;
import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    private final SongRepository songRepository;
    private final String uploadDir = "./uploads/";

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public List<Song> getAllSongs() {
        List<Song> songs = songRepository.findAll();
        return songs != null ? songs : Collections.emptyList();
    }

    @Override
    @Transactional
    public Song saveSong(Song song, MultipartFile audioFile, MultipartFile albumArtFile) {
        String audioFileName = saveFile(audioFile);
        String albumArtFileName = saveFile(albumArtFile);

        song.setFileName(audioFileName);
        song.setAlbumArt(albumArtFileName);

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

    private String saveFile(MultipartFile file) {
        String fileName = file.getOriginalFilename();
        Path filePath = Path.of(uploadDir, fileName);

        try {
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            // Handle the exception appropriately
            e.printStackTrace();
        }

        return fileName;
    }
}
