package com.crudwebapp.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pedidos")
public class InventoryOrders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fecha;
    private String descripcionMaterialOficina;
    private int cantidadMaterialOficina;
    private String descripcionMaterialIntendencia;
    private int cantidadMaterialIntendencia;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcionMaterialOficina() {
        return descripcionMaterialOficina;
    }

    public void setDescripcionMaterialOficina(String descripcionMaterialOficina) {
        this.descripcionMaterialOficina = descripcionMaterialOficina;
    }

    public int getCantidadMaterialOficina() {
        return cantidadMaterialOficina;
    }

    public void setCantidadMaterialOficina(int cantidadMaterialOficina) {
        this.cantidadMaterialOficina = cantidadMaterialOficina;
    }

    public String getDescripcionMaterialIntendencia() {
        return descripcionMaterialIntendencia;
    }

    public void setDescripcionMaterialIntendencia(String descripcionMaterialIntendencia) {
        this.descripcionMaterialIntendencia = descripcionMaterialIntendencia;
    }

    public int getCantidadMaterialIntendencia() {
        return cantidadMaterialIntendencia;
    }

    public void setCantidadMaterialIntendencia(int cantidadMaterialIntendencia) {
        this.cantidadMaterialIntendencia = cantidadMaterialIntendencia;
    }
}
