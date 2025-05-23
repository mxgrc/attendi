package com.attendi.repository;

import com.attendi.model.Zona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZonaRepository extends JpaRepository<Zona, Long> {
    // Aquí también podrías agregar métodos como buscar por nombreZona, etc.
    Zona findByNombreZona(String nombreZona);
}
