package com.application.music.controllers;

import com.application.music.models.Album;
import com.application.music.repositories.AlbumRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SongsController {
    private AlbumRepository albums;

    public SongsController(AlbumRepository albums){
        this.albums = albums;
    }

    @GetMapping("/albums.json")
    public @ResponseBody
    List<Album> viewAllAlbums(){
        return albums.findAll();
    }
}
