package com.dejenteklit.musicstore;

import com.dejenteklit.musicstore.model.Artist;
import com.dejenteklit.musicstore.model.Song;
import com.dejenteklit.musicstore.repository.ArtistRepository;
import com.dejenteklit.musicstore.repository.SongRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MusicStoreConfig {

    @Bean
    public CommandLineRunner commandLineRunner(ArtistRepository artistRepository, SongRepository songRepository) {
        return args -> {
            // Check if the artists already exist in the database
            if (artistRepository.count() == 0) {
                Artist artist1 = new Artist("Michael Jackson", "michaeljackson@gmail.com");
                Artist artist2 = new Artist("Ed Sheeran", "edsheeran@gmail.com");
                artistRepository.saveAll(Arrays.asList(artist1, artist2));

                Song song1 = new Song("Billie Jean", artist1);
                Song song2 = new Song("Thriller", artist1);
                Song song3 = new Song("Shape of You", artist2);
                Song song4 = new Song("Thinking Out Loud", artist2);
                songRepository.saveAll(Arrays.asList(song1, song2, song3, song4));
            }
        };
    }

}
