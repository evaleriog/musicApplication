package com.application.music.controllers;

import com.application.music.models.Album;
import com.application.music.models.Playlist;
import com.application.music.models.Song;
import com.application.music.repositories.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000/albums")
public class SongsController {
    private AlbumRepository albums;
    private ArtistRepository artists;
    private PlaylistRepository playlists;
    private SongRepository songs;
    private UserRepository users;

    public SongsController(AlbumRepository albums, ArtistRepository artists, PlaylistRepository playlists, SongRepository songs, UserRepository users){
        this.albums = albums;
        this.artists = artists;
        this.playlists = playlists;
        this.songs = songs;
        this.users = users;
    }

    @GetMapping("/albums")
    List<Album> viewAllAlbums(){
        return albums.findAll();
    }

    @GetMapping("/albums/id/songs")
    List<Song> viewAllSongsPerAlbum(@PathVariable long id) {
        return albums.getOne(id).getSongs();
    }

    //needs a better relationship
    @GetMapping("/artist/id/albums")
    List<Album> viewAllAlbumsPerArtist(@PathVariable long id){

        return albums.findAll();
    }

    @GetMapping("/user/id/playlists")
    List<Playlist> viewAllPlaylistsPerUser(@PathVariable long id){
        return users.getOne(id).getPlaylists();
    }

    @GetMapping("/playlist/id/songs")
    List<Song> viewAllSongsPerPlaylist(@PathVariable long id){
        return playlists.getOne(id).getSongs();
    }

    @GetMapping("/songs/id/albums")
    List<Album> viewAllAlbumsPerSong(@PathVariable long id){
        return songs.getOne(id).getAlbums();
    }

}
