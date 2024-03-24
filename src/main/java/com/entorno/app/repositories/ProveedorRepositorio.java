package com.entorno.app.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.entorno.app.models.Proveedor;

public interface ProveedorRepositorio extends JpaRepository<Proveedor, Integer>{
    
}
