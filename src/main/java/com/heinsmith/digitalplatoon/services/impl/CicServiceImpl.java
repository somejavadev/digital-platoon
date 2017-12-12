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
    public Cic getCicById(Long id) {
        return cicRepository.findOne(id);
    }

    @Override
    public Cic saveCic(Cic cic) {
        return cicRepository.save(cic);
    }
}
