package com.salesianostriana.E07.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


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




}
