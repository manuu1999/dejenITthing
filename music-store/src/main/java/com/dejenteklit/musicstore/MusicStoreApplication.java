package com.dejenteklit.musicstore;

import com.dejenteklit.musicstore.entity.Song;
import com.dejenteklit.musicstore.repository.SongRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
@SpringBootApplication
public class MusicStoreApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MusicStoreApplication.class, args);
	}
@Autowired
private SongRepository songRepository;
	@Override
	public void run(String... args) throws Exception {
	/*	Song song = new Song("Merhaba", "Dejen", "Model.jpg", "uploads/audio.mp3");
    	songRepository.save(song);*/
	}
}
