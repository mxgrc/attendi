package com.attendi.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;

    private double latitudEntrada;
    private double longitudEntrada;
    private double latitudSalida;
    private double longitudSalida;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "zona_id")
    private Zona zona;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public LocalTime getHoraEntrada() { return horaEntrada; }
    public void setHoraEntrada(LocalTime horaEntrada) { this.horaEntrada = horaEntrada; }

    public LocalTime getHoraSalida() { return horaSalida; }
    public void setHoraSalida(LocalTime horaSalida) { this.horaSalida = horaSalida; }

    public double getLatitudEntrada() { return latitudEntrada; }
    public void setLatitudEntrada(double latitudEntrada) { this.latitudEntrada = latitudEntrada; }

    public double getLongitudEntrada() { return longitudEntrada; }
    public void setLongitudEntrada(double longitudEntrada) { this.longitudEntrada = longitudEntrada; }

    public double getLatitudSalida() { return latitudSalida; }
    public void setLatitudSalida(double latitudSalida) { this.latitudSalida = latitudSalida; }

    public double getLongitudSalida() { return longitudSalida; }
    public void setLongitudSalida(double longitudSalida) { this.longitudSalida = longitudSalida; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public Zona getZona() { return zona; }
    public void setZona(Zona zona) { this.zona = zona; }
}
