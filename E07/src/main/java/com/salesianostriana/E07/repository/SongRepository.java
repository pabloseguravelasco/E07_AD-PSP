package com.salesianostriana.E07.repository;

import com.salesianostriana.E07.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
