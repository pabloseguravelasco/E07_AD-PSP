package com.salesianostriana.E07.service;

import com.salesianostriana.E07.model.PlayList;
import com.salesianostriana.E07.repository.PlayListRepository;
import com.salesianostriana.E07.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlayListService extends BaseService<PlayList, Long, PlayListRepository> {
}
