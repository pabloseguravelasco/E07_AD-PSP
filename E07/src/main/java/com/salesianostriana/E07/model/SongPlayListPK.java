package com.salesianostriana.E07.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@Embeddable
public class SongPlayListPK {

    private Long song_id;
    private Long playList_id;


}
