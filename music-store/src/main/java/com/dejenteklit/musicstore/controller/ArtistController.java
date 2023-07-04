/*
package com.dejenteklit.musicstore.controller;
import com.dejenteklit.musicstore.model.Artist;
import com.dejenteklit.musicstore.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${com.dejenteklit.musicstore.artist.path}")
public class ArtistController {
    private final ArtistService artistService;

    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping
    public List<Artist> getArtists() {
        return artistService.getArtists();
    }

    @PostMapping
    public void addNewArtist(@RequestBody Artist artist) {
        artistService.addNewArtist(artist);
    }

    @DeleteMapping(path = "{artistId}")
    public void deleteArtist(@PathVariable("artistId") Long artistId) {
        artistService.deleteArtist(artistId);
    }

    @PutMapping(path = "{artistId}")
    public void updateArtist(
            @PathVariable("artistId") Long artistId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        artistService.updateArtist(artistId, name, email);
    }
}
*/
