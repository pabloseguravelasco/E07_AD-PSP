package com.salesianostriana.E07.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor

public class AddedTo implements Serializable {

    @Builder.Default
    @EmbeddedId
    private SongPlayListPK id = new SongPlayListPK();


    private LocalDateTime datetime;
    private int orden;


    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name="song_id")
    private Song song;


    @ManyToOne
    @MapsId("playList_id")
    @JoinColumn(name="playList_id")
    private PlayList playList;

    //Métodos Helpers

    public void addSong(Song s){

            song = s;
            s.getAddedTo().add(this);


    }
    public void removeSong(Song s){
        song = s;
        s.getAddedTo().remove(this);
    }
    public void addPlayList(PlayList p){

            playList = p;
            p.getAddedTo().add(this);


    }
    public void removePlayList(PlayList p){
        playList = p;
        p.getAddedTo().remove(this);
    }
     public void addSongPlayList(Song s, PlayList p){

        addSong(s);
        addPlayList(p);

    }
    public void removeSongPlayList(Song s, PlayList p){
        removeSong(s);
        removePlayList(p);
    }



}
