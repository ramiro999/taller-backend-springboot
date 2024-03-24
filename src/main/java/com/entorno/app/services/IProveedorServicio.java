package com.entorno.app.services;

import java.util.List;
import com.entorno.app.models.Proveedor;

public interface IProveedorServicio {
    
    // Listar todo los proveedores
    public List<Proveedor> getProveedores();

    // Buscar un proveedor por id
    public Proveedor getProveedor(Integer id);

    // Guardar un proveedor
    public Proveedor grabarProveedor(Proveedor proveedor);

    // Eliminar un Proveedor
    public void delete(Integer id);
}
