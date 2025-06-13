package com.santicue.reservas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "habitaciones")
public class Habitacion {
    @Id
    private Integer id_habitacion;
    private Integer capacidad;
    private Double precio_noche;

    public Integer getId_habitacion() { return id_habitacion; }
    public void setId_habitacion(Integer id_habitacion) { this.id_habitacion = id_habitacion; }
    public Integer getCapacidad() { return capacidad; }
    public void setCapacidad(Integer capacidad) { this.capacidad = capacidad; }
    public Double getPrecio_noche() { return precio_noche; }
    public void setPrecio_noche(Double precio_noche) { this.precio_noche = precio_noche; }
} 