package com.santicue.reservas.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_reservas;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_habitacion")
    private Habitacion habitacion;

    private Integer dias;
    private Double total;
    private Timestamp fecha_reserva;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public Integer getId_reservas() { return id_reservas; }
    public void setId_reservas(Integer id_reservas) { this.id_reservas = id_reservas; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Habitacion getHabitacion() { return habitacion; }
    public void setHabitacion(Habitacion habitacion) { this.habitacion = habitacion; }
    public Integer getDias() { return dias; }
    public void setDias(Integer dias) { this.dias = dias; }
    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
    public Timestamp getFecha_reserva() { return fecha_reserva; }
    public void setFecha_reserva(Timestamp fecha_reserva) { this.fecha_reserva = fecha_reserva; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
} 