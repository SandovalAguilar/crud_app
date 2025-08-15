package com.crudwebapp.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "inventario_entradas")  // Table name in the database
public class InventoryEntries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AUTO_INCREMENT
    private Long id;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;  // Using Java LocalDate for date fields

    @Column(name = "nombre_proveedor", nullable = false, length = 100)
    private String nombreProveedor;

    @Column(name = "descripcion_material", nullable = false, length = 255)
    private String descripcionMaterial;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Column(name = "nota", nullable = true, columnDefinition = "TEXT")
    private String nota;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    public void setDescripcionMaterial(String descripcionMaterial) {
        this.descripcionMaterial = descripcionMaterial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
