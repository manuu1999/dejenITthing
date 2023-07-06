/*
package com.dejenteklit.musicstore;
import com.dejenteklit.musicstore.entity.Artist;
import com.dejenteklit.musicstore.entity.Platform;
import com.dejenteklit.musicstore.entity.Song;
import com.dejenteklit.musicstore.repository.ArtistRepository;
import com.dejenteklit.musicstore.repository.PlatformRepository;
import com.dejenteklit.musicstore.repository.SongRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MusicStoreConfig {

    @Bean
    public CommandLineRunner commandLineRunner(ArtistRepository artistRepository, PlatformRepository platformRepository, SongRepository songRepository) {
        return args -> {
            // Check if the artists and platforms already exist in the database
            if (artistRepository.count() == 0 && platformRepository.count() == 0) {
                Artist artist1 = new Artist("Michael Jackson", "michaeljackson@gmail.com");
                Artist artist2 = new Artist("Ed Sheeran", "edsheeran@gmail.com");
                artistRepository.saveAll(Arrays.asList(artist1, artist2));

                Platform platform1 = new Platform("Spotify");
                Platform platform2 = new Platform("Apple Music");
                platformRepository.saveAll(Arrays.asList(platform1, platform2));

                Song song1 = new Song("Billie Jean", artist1, "album-art-1.jpg");
                Song song2 = new Song("Thriller", artist1, "album-art-2.jpg");
                Song song3 = new Song("Shape of You", artist2, "album-art-3.jpg");
                Song song4 = new Song("Thinking Out Loud", artist2, "album-art-4.jpg");
                song1.setPlatforms(Arrays.asList(platform1, platform2));
                song2.setPlatforms(Arrays.asList(platform1));
                song3.setPlatforms(Arrays.asList(platform2));
                song4.setPlatforms(Arrays.asList(platform1, platform2));
                songRepository.saveAll(Arrays.asList(song1, song2, song3, song4));
            }
        };
    }

}
*/
