package com.dejenteklit.musicstore.repository;
import com.dejenteklit.musicstore.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    Optional<Artist> findArtistByEmail(String email);
    // You can add custom query methods here if needed
}
