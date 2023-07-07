package com.dejenteklit.musicstore.controller;

import com.dejenteklit.musicstore.entity.Song;
import com.dejenteklit.musicstore.service.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

@Controller
@RequestMapping("/songs")
public class SongController {

    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
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

    @PostMapping
    public String saveSong(@ModelAttribute("song") @Valid Song song, BindingResult bindingResult,
                           @RequestParam("audioFile") MultipartFile audioFile,
                           @RequestParam("albumArtFile") MultipartFile albumArtFile) {
        if (bindingResult.hasErrors()) {
            return "upload";
        }

        songService.saveSong(song, audioFile, albumArtFile);
        return "redirect:/songs";
    }
}
