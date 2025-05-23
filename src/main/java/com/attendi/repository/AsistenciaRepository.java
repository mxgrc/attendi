package com.attendi.repository;

import com.attendi.model.Asistencia;
import com.attendi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AsistenciaRepository extends JpaRepository<Asistencia, Long> {
    List<Asistencia> findByUsuario(Usuario usuario);
    List<Asistencia> findByFecha(LocalDate fecha);
}
