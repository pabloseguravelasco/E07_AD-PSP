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


    @EmbeddedId
    private SongPlayListPK id = new SongPlayListPK();


    private LocalDateTime datetime;
    private int order;


    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name="song_id")
    private Song song;


    @ManyToOne
    @MapsId("playList_id")
    @JoinColumn(name="playList_id")
    private PlayList playList;

    //Helpers

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
  /*  public void addSongPlayList(Song s, PlayList p){


    }
    public void removeSongPlayList(Song s, PlayList p){

    }*/



}
