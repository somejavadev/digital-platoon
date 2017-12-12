package com.heinsmith.digitalplatoon.services;

import com.heinsmith.digitalplatoon.entities.Cic;

public interface CicService {

    Cic getByEntityId(Long id);
    Cic getByCicId(Long id);
    Cic saveCic(Cic cic);
}
