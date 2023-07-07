package com.dejenteklit.musicstore.repository;

import com.dejenteklit.musicstore.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    List<Song> findByTitle(String title);
}
