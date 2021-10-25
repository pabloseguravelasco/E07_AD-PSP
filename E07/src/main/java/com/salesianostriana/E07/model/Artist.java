package com.salesianostriana.E07.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Artist {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "song")
    private List<Song> songs = new ArrayList<>();

    //Helpers

    public void addSong(Song s) {
        this.songs = s;
        if (s.getSongs == null)
            s.setAlumnos(new ArrayList<>());
        c.getAlumnos().add(this);
    }

    public void removeCurso(Curso c) {
        c.getAlumnos().remove(this);
        this.curso = null;
    }
}
