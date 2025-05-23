package com.attendi.repository;

import com.attendi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Puedes agregar métodos personalizados aquí si quieres buscar por email, rut, etc.
    Usuario findByRut(String rut);
    Usuario findByEmail(String email);
}
