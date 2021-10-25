package com.salesianostriana.E07.repository;

import com.salesianostriana.E07.model.AddedTo;
import com.salesianostriana.E07.model.SongPlayListPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddedToRepository extends JpaRepository<AddedTo, SongPlayListPK> {
}
