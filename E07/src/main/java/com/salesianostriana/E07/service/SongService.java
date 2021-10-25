package com.salesianostriana.E07.service;


import com.salesianostriana.E07.model.Song;
import com.salesianostriana.E07.repository.SongRepository;
import com.salesianostriana.E07.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService extends BaseService<Song, Long, SongRepository> {
}
