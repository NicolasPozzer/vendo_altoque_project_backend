package com.demo.vendo_altoque_project_backend.controller;

import com.demo.vendo_altoque_project_backend.service.ObjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjetoController {

    @Autowired
    ObjetoService ObjService;
}
