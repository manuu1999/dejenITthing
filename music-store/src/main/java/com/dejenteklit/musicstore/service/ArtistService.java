package com.dejenteklit.musicstore.service;
import com.dejenteklit.musicstore.model.Artist;
import com.dejenteklit.musicstore.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class ArtistService {
    private final ArtistRepository artistRepository;

    @Autowired
    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> getArtists() {
        return artistRepository.findAll();
    }

    public void addNewArtist(Artist artist) {
        Optional<Artist> artistOptional = artistRepository.findArtistByEmail(artist.getEmail());
        if (artistOptional.isPresent()) {
            throw new IllegalStateException("Email taken");
        }
        artistRepository.save(artist);
    }

    public void deleteArtist(Long artistId) {
        boolean exists = artistRepository.existsById(artistId);
        if (!exists) {
            throw new IllegalStateException("Artist with id " + artistId + " does not exist");
        }
        artistRepository.deleteById(artistId);
    }

    public void updateArtist(Long artistId, String name, String email) {
        Artist artist = artistRepository.findById(artistId)
                .orElseThrow(() -> new IllegalStateException("Artist with id " + artistId + " does not exist"));

        if (name != null && !Objects.equals(artist.getName(), name)) {
            artist.setName(name);
        }

        if (email != null && !Objects.equals(artist.getEmail(), email)) {
            Optional<Artist> artistOptional = artistRepository.findArtistByEmail(email);
            if (artistOptional.isPresent()) {
                throw new IllegalStateException("Email taken");
            }
            artist.setEmail(email);
        }
    }
}
