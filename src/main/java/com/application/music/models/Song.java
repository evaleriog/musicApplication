package com.application.music.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT UNSIGNED")
    private long id;

    @Column(nullable = false, length = 100)
    private String name;

    @ManyToMany(mappedBy = "songs")
    private List<Album> albums;

    @Column
    private int length;

}
