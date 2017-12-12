package com.heinsmith.digitalplatoon.services.impl;

import com.heinsmith.digitalplatoon.database.CicRepository;
import com.heinsmith.digitalplatoon.entities.Cic;
import com.heinsmith.digitalplatoon.services.CicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CicServiceImpl implements CicService {

    @Autowired
    private CicRepository cicRepository;

    @Override
    public Cic getByEntityId(Long entityId) {
        return cicRepository.findOne(entityId);
    }

    @Override
    public Cic getByCicId(Long cicId) {
        return cicRepository.findCicByCicId(cicId);
    }

    @Override
    public Cic saveCic(Cic cic) {
        return cicRepository.save(cic);
    }
}
