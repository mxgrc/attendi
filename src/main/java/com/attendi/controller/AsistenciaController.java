package com.attendi.controller;

import com.attendi.model.Asistencia;
import com.attendi.service.AsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asistencias")
@CrossOrigin(origins = "*")
public class AsistenciaController {

    @Autowired
    private AsistenciaService asistenciaService;

    @PostMapping("/entrada")
    public Asistencia marcarEntrada(@RequestBody Asistencia asistencia) {
        return asistenciaService.registrarEntrada(asistencia);
    }

    @PostMapping("/salida/{id}")
    public Asistencia marcarSalida(@PathVariable Long id, @RequestBody Coordenadas coordenadas) {
        return asistenciaService.registrarSalida(id, coordenadas.getLatitud(), coordenadas.getLongitud());
    }

    @GetMapping
    public List<Asistencia> obtenerAsistencias() {
        return asistenciaService.obtenerTodas();
    }

    // Clase interna temporal para coordenadas
    public static class Coordenadas {
        private double latitud;
        private double longitud;

        public double getLatitud() { return latitud; }
        public void setLatitud(double latitud) { this.latitud = latitud; }

        public double getLongitud() { return longitud; }
        public void setLongitud(double longitud) { this.longitud = longitud; }
    }
}
