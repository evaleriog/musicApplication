package com.application.music.repositories;

import com.application.music.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AlbumRepository extends JpaRepository<Album, Long> {
}
