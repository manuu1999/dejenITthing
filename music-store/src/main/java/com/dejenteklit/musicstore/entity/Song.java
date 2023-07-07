package com.dejenteklit.musicstore.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String title;

    @NotBlank
    @Column(nullable = false)
    private String artist;

    @Column(name = "album_art")
    private String albumArt;

    @NotBlank
    @Size(min = 1, max = 255)
    @Column(name = "file_name")
    private String fileName;

    public Song() {
    }

    public Song(String title, String artist, String albumArt, String fileName) {
        this.title = title;
        this.artist = artist;
        this.albumArt = albumArt;
        this.fileName = fileName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbumArt() {
        return albumArt;
    }

    public void setAlbumArt(String albumArt) {
        this.albumArt = albumArt;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    // Custom method to populate sample data
    public static Song createSampleSong() {
        return new Song("Sample Song", "Sample Artist", "album-art.jpg", "sample-song.mp3");
    }
}
