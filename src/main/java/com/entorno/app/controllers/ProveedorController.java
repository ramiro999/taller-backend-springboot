package com.entorno.app.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entorno.app.models.Proveedor;
import com.entorno.app.services.ProveedorServicio;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@CrossOrigin("*")
@RequestMapping("api/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorServicio proveedorServicio;

    @GetMapping("/list")
    public List<Proveedor> consultarTodo() {
        return (proveedorServicio.getProveedores());
    }

    @GetMapping("/list/{id}")
    public Proveedor buscarPorId(@PathVariable Integer id) {
        return proveedorServicio.getProveedor(id);
    }

    @PostMapping("/")
    public ResponseEntity<Proveedor> agregar(@RequestBody Proveedor proveedor) {
        Proveedor obj = proveedorServicio.grabarProveedor(proveedor);
        return new ResponseEntity<>(obj, HttpStatus.OK);
        
    }
    
    
    @PutMapping("/")
    public ResponseEntity<Proveedor> editar(@RequestBody Proveedor proveedor){
        Proveedor obj = proveedorServicio.getProveedor(proveedor.getId());
        if(obj != null){
            obj.setDireccion(proveedor.getDireccion());
            obj.setCiudad(proveedor.getCiudad());
            obj.setNombre(proveedor.getNombre());
            obj.setTelefono(proveedor.getTelefono());
            obj.setNit(proveedor.getNit());
            proveedorServicio.grabarProveedor(obj);
        } else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
            return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Proveedor> eliminar(@PathVariable Integer id){
        Proveedor obj = proveedorServicio.getProveedor(id);
        if(obj != null){
            proveedorServicio.delete(id);
        } else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
            return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
