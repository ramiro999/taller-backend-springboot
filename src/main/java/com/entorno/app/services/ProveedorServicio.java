package com.entorno.app.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entorno.app.models.Proveedor;
import com.entorno.app.repositories.ProveedorRepositorio;

@Service
@jakarta.transaction.Transactional
public class ProveedorServicio implements IProveedorServicio{
    
    @Autowired
    private ProveedorRepositorio proveedorRepo;

        @Override
        public Proveedor getProveedor(Integer id){
            return proveedorRepo.findById(id).orElse(null);
        }

        @Override
        public Proveedor grabarProveedor(Proveedor proveedor){
            return proveedorRepo.save(proveedor);
        }

        @Override
        public void delete(Integer id){
            proveedorRepo.deleteById(id);
        }

        @Override
        public List<Proveedor> getProveedores() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getProveedores'");
        }
}
