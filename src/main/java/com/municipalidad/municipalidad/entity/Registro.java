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
@Table(name="registro")
@Getter
@Setter
@NoArgsConstructor
public class Registro extends BaseEntity{
    private String nombre;
    private String descripcion;
    
     @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "administrador_id")
    private Administrador administrador;
}
