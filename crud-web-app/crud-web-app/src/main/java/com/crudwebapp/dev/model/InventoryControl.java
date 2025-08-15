package com.crudwebapp.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "control_inventario")
public class InventoryControl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String materialOficina;
    private String descripcionOficina;
    private int cantidadOficina;
    
    private String materialIntendencia;
    private String descripcionIntendencia;
    private int cantidadIntendencia;
    
    private String consumibles;
    private String descripcionConsumibles;
    private int cantidadConsumibles;
    
    private String materialMtto;
    private String descripcionMtto;
    private int cantidadMtto;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterialOficina() {
        return materialOficina;
    }

    public void setMaterialOficina(String materialOficina) {
        this.materialOficina = materialOficina;
    }

    public String getDescripcionOficina() {
        return descripcionOficina;
    }

    public void setDescripcionOficina(String descripcionOficina) {
        this.descripcionOficina = descripcionOficina;
    }

    public int getCantidadOficina() {
        return cantidadOficina;
    }

    public void setCantidadOficina(int cantidadOficina) {
        this.cantidadOficina = cantidadOficina;
    }

    public String getMaterialIntendencia() {
        return materialIntendencia;
    }

    public void setMaterialIntendencia(String materialIntendencia) {
        this.materialIntendencia = materialIntendencia;
    }

    public String getDescripcionIntendencia() {
        return descripcionIntendencia;
    }

    public void setDescripcionIntendencia(String descripcionIntendencia) {
        this.descripcionIntendencia = descripcionIntendencia;
    }

    public int getCantidadIntendencia() {
        return cantidadIntendencia;
    }

    public void setCantidadIntendencia(int cantidadIntendencia) {
        this.cantidadIntendencia = cantidadIntendencia;
    }

    public String getConsumibles() {
        return consumibles;
    }

    public void setConsumibles(String consumibles) {
        this.consumibles = consumibles;
    }

    public String getDescripcionConsumibles() {
        return descripcionConsumibles;
    }

    public void setDescripcionConsumibles(String descripcionConsumibles) {
        this.descripcionConsumibles = descripcionConsumibles;
    }

    public int getCantidadConsumibles() {
        return cantidadConsumibles;
    }

    public void setCantidadConsumibles(int cantidadConsumibles) {
        this.cantidadConsumibles = cantidadConsumibles;
    }

    public String getMaterialMtto() {
        return materialMtto;
    }

    public void setMaterialMtto(String materialMtto) {
        this.materialMtto = materialMtto;
    }

    public String getDescripcionMtto() {
        return descripcionMtto;
    }

    public void setDescripcionMtto(String descripcionMtto) {
        this.descripcionMtto = descripcionMtto;
    }

    public int getCantidadMtto() {
        return cantidadMtto;
    }

    public void setCantidadMtto(int cantidadMtto) {
        this.cantidadMtto = cantidadMtto;
    }
}
