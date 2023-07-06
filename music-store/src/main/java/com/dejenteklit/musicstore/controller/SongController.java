package com.dejenteklit.musicstore.controller;

import com.dejenteklit.musicstore.entity.Song;
import com.dejenteklit.musicstore.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/songs")
public class SongController {

    private SongService songService;
    public SongController(SongService songService) {
        super();
        this.songService = songService;
    }

    @GetMapping("/songs")
    public String listSongs(Model model) {
        model.addAttribute("songs", songService.getAllSongs());
        return "songs";
    }

    @GetMapping("/upload")
    public String uploadForm(Model model) {
        Song song = new Song();
        model.addAttribute("song", song);
        return "upload";
    }

    @PostMapping("/songs")
    public String saveSong(@ModelAttribute("song") Song song) {
        songService.saveSong(song);
        return "redirect:/songs";
    }

   /* @GetMapping("/edit/{id}")
    public String editSongForm(@PathVariable Long id, Model model) {
        model.addAttribute("song", songService.getSongById(id));
        return "edit_song";
    }*/

    @PostMapping("/{id}")
    public String updateSong(@PathVariable Long id, @ModelAttribute("song") Song song) {
        Song existingSong = songService.getSongById(id);
        existingSong.setTitle(song.getTitle());
        existingSong.setArtist(song.getArtist());
        existingSong.setAlbumArt(song.getAlbumArt());
        songService.updateSong(existingSong);
        return "redirect:/songs";
    }

   /* @GetMapping("/{id}")
    public String deleteSong(@PathVariable Long id) {
        songService.deleteSongById(id);
        return "redirect:/songs";
    }*/
}
