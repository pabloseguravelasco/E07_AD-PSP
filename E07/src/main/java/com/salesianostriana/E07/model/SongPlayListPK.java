package com.salesianostriana.E07.model;


import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;


@NoArgsConstructor
@Embeddable
@AllArgsConstructor
@Getter
@Setter
public class SongPlayListPK implements Serializable {

    private Long song_id;
    private Long playList_id;


}