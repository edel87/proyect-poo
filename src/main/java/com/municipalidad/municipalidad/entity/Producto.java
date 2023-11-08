package com.municipalidad.municipalidad.entity;

import com.municipalidad.municipalidad.shared.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="producto")
@Getter
@Setter
@NoArgsConstructor
public class Producto extends BaseEntity{
    private String nombre;
    private int cantidad;
    private String estado;
    private int precio;

     @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "almacen_id")
    private Almacen almacen;
 
}
