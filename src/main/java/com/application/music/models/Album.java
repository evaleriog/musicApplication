package com.application.music.models;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT UNSIGNED")
    private long id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, length = 5)
    private String year;

    @OneToOne
    private Artist artist;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "album_songs",
            joinColumns = {@JoinColumn(name="album_id")},
            inverseJoinColumns={@JoinColumn(name="song_id")}
    )
    private List<Song> songs;

    public Album() {
    }

    public Album(String name, String year, Artist artist, List<Song> songs) {
        this.name = name;
        this.year = year;
        this.artist = artist;
        this.songs = songs;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
