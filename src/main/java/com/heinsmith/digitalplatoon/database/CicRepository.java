package com.heinsmith.digitalplatoon.database;

import com.heinsmith.digitalplatoon.entities.Cic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CicRepository extends CrudRepository<Cic, Long> {
}
