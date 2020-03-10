package com.application.music.controllers;

import com.application.music.models.Album;
import com.application.music.repositories.AlbumRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class SongsController {
    private AlbumRepository albums;

    public SongsController(AlbumRepository albums){
        this.albums = albums;
    }

    @GetMapping("/albums")
    List<Album> viewAllAlbums(){
        return albums.findAll();
    }
}
