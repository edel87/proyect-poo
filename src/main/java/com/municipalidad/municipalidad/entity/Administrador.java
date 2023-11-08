package com.municipalidad.municipalidad.entity;

import com.municipalidad.municipalidad.shared.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "administrador")
@Getter
@Setter
@NoArgsConstructor
public class Administrador extends BaseEntity {
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;

}
