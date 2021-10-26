package com.salesianostriana.E07.service;

import com.salesianostriana.E07.model.*;
import com.salesianostriana.E07.repository.AddedToRepository;
import com.salesianostriana.E07.repository.ArtistRepository;
import com.salesianostriana.E07.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AddedToService extends BaseService<AddedTo, SongPlayListPK, AddedToRepository> {

    public void createAddedTo(PlayList p, Song s, SongService songService, PlayListService playListService){


        AddedTo addedTo = AddedTo.builder()
                .orden(2)
                .datetime(LocalDateTime.now())
                .build();

        addedTo.addSongPlayList(s,p);

        save(addedTo);
        songService.save(s);
        playListService.save(p);
    }
}
