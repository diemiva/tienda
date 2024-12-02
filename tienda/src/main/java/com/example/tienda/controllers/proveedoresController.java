package com.example.tienda.controllers;

import com.example.tienda.models.proveedoresModel;
import com.example.tienda.services.proveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/proveedores")

public class proveedoresController {
    @Autowired
    private proveedoresService proveedoresService;

    //read
    @GetMapping
    public List<proveedoresModel> getAllProveedores() {
        return proveedoresService.getProveedores();
    }
    //read by id
    @GetMapping("/{proveedorId}")
    public Optional<proveedoresModel> getProveedoreById(@PathVariable("proveedorId") Long proveedorId) {
        return proveedoresService.getProveedor(proveedorId);
    }
    //create or update
    @PostMapping
    public void saveUpdate(@RequestBody proveedoresModel proveedoresModel) {
        proveedoresService.saveOrUpdate(proveedoresModel);
    }
    //delete
    @DeleteMapping("/{proveedorId}")
    public void deleteProveedoreById(@PathVariable("proveedorId") Long proveedorId) {
        proveedoresService.deleteProveedor(proveedorId);
    }




}



