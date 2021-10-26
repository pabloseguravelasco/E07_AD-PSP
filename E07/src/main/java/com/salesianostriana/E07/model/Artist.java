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
    @Builder.Default
    @OneToMany(mappedBy = "artist")
    private List<Song> songs = new ArrayList<>();


}
