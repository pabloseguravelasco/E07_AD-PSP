package com.salesianostriana.E07.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class PlayList {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "playList", fetch = FetchType.EAGER)
    private List<AddedTo> addedTo = new ArrayList<>();




}
