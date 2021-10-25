package com.salesianostriana.E07;


import com.salesianostriana.E07.model.Artist;
import com.salesianostriana.E07.model.PlayList;
import com.salesianostriana.E07.model.Song;
import com.salesianostriana.E07.service.ArtistService;
import com.salesianostriana.E07.service.PlayListService;
import com.salesianostriana.E07.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ArtistService artistService;
    private final SongService songService;
    private final PlayListService playlistService;

    @PostConstruct
    public void init() {

        //Add artist
        Artist artist = Artist.builder()
                .name("Bad Bunny")
                .build();
        artistService.save(artist);

        //Add song
        Song song = Song.builder()
                .album("Saddness Rain")
                .title("No para de llover")
                .year("2004")
                .build();
        song.addArtist(artist);
        songService.save(song);


        //Add playList
        PlayList playList = PlayList.builder()
                .name("Fan de Naruto")
                .description("Canciones del tipo me convierto en itachi")
                .build();
        playlistService.save(playList);


    }
}