package com.salesianostriana.E07.service;

import com.salesianostriana.E07.model.AddedTo;
import com.salesianostriana.E07.model.Artist;
import com.salesianostriana.E07.model.SongPlayListPK;
import com.salesianostriana.E07.repository.AddedToRepository;
import com.salesianostriana.E07.repository.ArtistRepository;
import com.salesianostriana.E07.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AddedToService extends BaseService<AddedTo, SongPlayListPK, AddedToRepository> {
}
