package com.attendi.model;

import jakarta.persistence.*;

@Entity
public class Zona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreZona;
    private double latitudCentro;
    private double longitudCentro;
    private double radioPermitido;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombreZona() { return nombreZona; }
    public void setNombreZona(String nombreZona) { this.nombreZona = nombreZona; }

    public double getLatitudCentro() { return latitudCentro; }
    public void setLatitudCentro(double latitudCentro) { this.latitudCentro = latitudCentro; }

    public double getLongitudCentro() { return longitudCentro; }
    public void setLongitudCentro(double longitudCentro) { this.longitudCentro = longitudCentro; }

    public double getRadioPermitido() { return radioPermitido; }
    public void setRadioPermitido(double radioPermitido) { this.radioPermitido = radioPermitido; }
}
