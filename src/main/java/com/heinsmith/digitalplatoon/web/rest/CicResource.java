package com.heinsmith.digitalplatoon.web.rest;

import com.heinsmith.digitalplatoon.entities.Cic;
import com.heinsmith.digitalplatoon.services.CicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cic")
public class CicResource {

    @Autowired
    private CicService cicService;

    @PostMapping
    public Cic create(@RequestBody Cic cic) {
        return cicService.saveCic(cic);
    }

    @GetMapping("/{cicId}")
    public Cic get(@PathVariable Long cicId) {
        return cicService.getByCicId(cicId);
    }
}
