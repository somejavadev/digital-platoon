package com.heinsmith.digitalplatoon.services;

import com.heinsmith.digitalplatoon.entities.Cic;

public interface CicService {

    Cic getByCicId(Long id);
    Cic saveCic(Cic cic);
}
