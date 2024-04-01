package com.demo.vendo_altoque_project_backend.controller;

import com.demo.vendo_altoque_project_backend.model.Objeto;
import com.demo.vendo_altoque_project_backend.service.ObjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objetos")
public class ObjetoController {

    @Autowired
    ObjetoService objServ;

    @GetMapping("/list")
    public List<Objeto> getObejetos(){
        return objServ.getObjetos();
    }

    @PostMapping("/save")
    public String saveObjeto(@RequestBody Objeto objeto){
        objServ.saveObjeto(objeto);
        return "Objeto Creado!";
    }

    @DeleteMapping("/delete/{id_objeto}")
    public String deleteMapping(@PathVariable Long id_objeto){
        objServ.deleteObjeto(id_objeto);
        return "Objeto Eliminado Correctamente!";
    }

    @GetMapping("/find/{id_objeto}")
    public Objeto findObjeto(@PathVariable Long id_objeto){
        return objServ.findObjeto(id_objeto);
    }

    @PutMapping("/edit")
    public String editObjeto(@RequestBody Objeto objeto){
        objServ.editObjeto(objeto);
        return "Objeto Editado!!!";
    }
}
