package com.salesianostriana.E07.repository;

import com.salesianostriana.E07.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
