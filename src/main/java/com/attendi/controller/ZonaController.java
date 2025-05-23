package com.attendi.controller;

import com.attendi.model.Zona;
import com.attendi.service.ZonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zonas")
@CrossOrigin(origins = "*")
public class ZonaController {

    @Autowired
    private ZonaService zonaService;

    @PostMapping
    public Zona crearZona(@RequestBody Zona zona) {
        return zonaService.guardarZona(zona);
    }

    @GetMapping
    public List<Zona> obtenerZonas() {
        return zonaService.listarZonas();
    }
}
