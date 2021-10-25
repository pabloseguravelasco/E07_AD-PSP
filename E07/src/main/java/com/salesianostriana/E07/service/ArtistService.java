package com.salesianostriana.E07.service;

import com.salesianostriana.E07.model.Artist;
import com.salesianostriana.E07.repository.ArtistRepository;
import com.salesianostriana.E07.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService  extends BaseService<Artist, Long, ArtistRepository> {
}
