package com.municipalidad.municipalidad.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.municipalidad.municipalidad.entity.Administrador;
import com.municipalidad.municipalidad.shared.BaseController;

@RestController
@RequestMapping("/administrador")
public class AdministradorController extends BaseController<Administrador> {
    
}
