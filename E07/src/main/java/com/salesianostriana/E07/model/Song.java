package com.salesianostriana.E07.model;


import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Song {

    @Id
    @GeneratedValue
    private Long id;


    private String title;
    private String album;
    private String year;


    @ManyToOne
    @JoinColumn(name = "artist", foreignKey = @ForeignKey(name = "FK_SONG_ARTIST"))
    private Artist artist;


}
