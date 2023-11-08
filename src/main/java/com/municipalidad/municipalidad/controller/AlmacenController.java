package com.municipalidad.municipalidad.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.municipalidad.municipalidad.entity.Almacen;
import com.municipalidad.municipalidad.shared.BaseController;

@RestController
@RequestMapping("/almacen")
public class AlmacenController extends BaseController<Almacen> {

}
