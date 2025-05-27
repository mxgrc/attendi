package com.attendi.service;

import com.attendi.model.Asistencia;
import com.attendi.repository.AsistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsistenciaService {

    @Autowired
    private AsistenciaRepository asistenciaRepository;

    public Asistencia registrarEntrada(Asistencia asistencia) {
        asistencia.setHoraSalida(null); // solo se registra entrada
        return asistenciaRepository.save(asistencia);
    }

    public Asistencia registrarSalida(Long asistenciaId, double latitud, double longitud) {
        Asistencia asistencia = asistenciaRepository.findById(asistenciaId).orElse(null);
        if (asistencia != null) {
            asistencia.setLatitudSalida(latitud);
            asistencia.setLongitudSalida(longitud);
            asistencia.setHoraSalida(java.time.LocalTime.now());
            return asistenciaRepository.save(asistencia);
        }
        return null;
    }

    public List<Asistencia> obtenerTodas() {
        return asistenciaRepository.findAll();
    }
}
