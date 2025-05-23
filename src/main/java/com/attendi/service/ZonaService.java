package com.attendi.service;

import com.attendi.model.Zona;
import com.attendi.repository.ZonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZonaService {

    @Autowired
    private ZonaRepository zonaRepository;

    public Zona guardarZona(Zona zona) {
        return zonaRepository.save(zona);
    }

    public List<Zona> listarZonas() {
        return zonaRepository.findAll();
    }
}
