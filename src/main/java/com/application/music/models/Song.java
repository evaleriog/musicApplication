package com.application.music.models;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT UNSIGNED")
    private long id;

    @Column(nullable = false, length = 100)
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "songs")
    private List<Album> albums;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="playlist_songs",
            joinColumns = {@JoinColumn(name="song_id")},
            inverseJoinColumns = {@JoinColumn(name="playlist_id")}
    )
    private List<Playlist> playlists;

    @Column
    private int length;

    public Song() {
    }

    public Song(String name, List<Album> albums, List<Playlist> playlists, int length) {
        this.name = name;
        this.albums = albums;
        this.playlists = playlists;
        this.length = length;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
