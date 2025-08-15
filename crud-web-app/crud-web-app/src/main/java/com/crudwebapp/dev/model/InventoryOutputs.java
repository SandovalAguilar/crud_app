package com.crudwebapp.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.time.LocalDate;

@Entity
@Table(name = "inventario_salidas")  // Table name in the database
public class InventoryOutputs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AUTO_INCREMENT
    private Long id;

    @Column(name = "departamento", nullable = false, length = 100)
    private String departamento;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Column(name = "descripcion", nullable = false, length = 255)
    private String descripcion;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;  // Using Java 21 LocalDate for date fields

    @Enumerated(EnumType.STRING)
    @Column(name = "entregado", nullable = false)
    private Delivered entregado = Delivered.NO;  // Default value is 'no'

    @Column(name = "recibio", nullable = false, length = 100)
    private String recibido;

    // Getters and Setters (Optional, if needed for your use case)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Delivered getEntregado() {
        return entregado;
    }

    public void setEntregado(Delivered entregado) {
        this.entregado = entregado;
    }

    public String getRecibido() {
        return recibido;
    }

    public void setRecibido(String recibido) {
        this.recibido = recibido;
    }

    // Enum for 'entregado' field
    public enum Delivered {
        SI("si"),
        NO("no");

        private final String value;

        Delivered(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}

