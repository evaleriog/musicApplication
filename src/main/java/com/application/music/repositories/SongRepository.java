package com.application.music.repositories;

import com.application.music.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SongRepository extends JpaRepository<Song, Long> {
}
