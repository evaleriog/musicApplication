package com.application.music.models;

import javax.persistence.*;

@Entity
@Table(name="artists")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT UNSIGNED")
    private long id;

    @Column(nullable = false)
    private String name;

    public Artist() {
    }

    public Artist(String name) {
        this.name = name;
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
}
