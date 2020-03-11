package com.application.music.controllers;

import com.application.music.models.Album;
import com.application.music.models.Song;
import com.application.music.repositories.AlbumRepository;
import com.application.music.repositories.ArtistRepository;
import com.application.music.repositories.PlaylistRepository;
import com.application.music.repositories.SongRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class SongsController {
    private AlbumRepository albums;
    private ArtistRepository artists;
    private PlaylistRepository playlists;
    private SongRepository songs;

    public SongsController(AlbumRepository albums, ArtistRepository artists, PlaylistRepository playlists, SongRepository songs){
        this.albums = albums;
        this.artists = artists;
        this.playlists = playlists;
        this.songs = songs;
    }

    @GetMapping("/albums")
    List<Album> viewAllAlbums(){
        return albums.findAll();
    }

    @GetMapping("/album/id/songs")
    List<Song> viewAllSongsPerAlbum(@PathVariable long id) {
        return albums.getOne(id).getSongs();
    }

    @GetMapping("/artist/id/albums")
    List<Album> viewAllAlbumsPerArtist(@PathVariable long id){

        return albums.findAll();
    }


}
