package com.salesianostriana.E07.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data @NoArgsConstructor
@Entity
public class AddedTo implements Serializable {


    @EmbeddedId
    private SongPlayListPK id = new SongPlayListPK();


    private String datetime;
    private String order;


    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name="song_id")
    private Song song;


    @ManyToOne
    @MapsId("playList_id")
    @JoinColumn(name="playList_id")
    private PlayList playList;



}
