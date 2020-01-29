package com.application.music.models;

import jdk.jfr.Enabled;

import javax.persistence.*;
import java.util.List;

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

    @Column(length = 3)
    private int totalSongs;

    @ManyToMany
    @JoinTable(
            name = "album_songs",
            joinColumns = {@JoinColumn(name="album_id")},
            inverseJoinColumns={@JoinColumn(name="song_id")}
    )
    private List<Song> songs;


   // private int totalTime;


}
