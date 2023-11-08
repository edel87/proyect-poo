package com.municipalidad.municipalidad.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.municipalidad.municipalidad.entity.Registro;
import com.municipalidad.municipalidad.shared.BaseController;

@RestController
@RequestMapping("/registro")
public class RegistroController extends BaseController<Registro> {
    
}
