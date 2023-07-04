package com.dejenteklit.musicstore.repository;
import com.dejenteklit.musicstore.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    Optional<Song> findSongByTitle(String title);
    // You can add custom query methods here if needed
}
