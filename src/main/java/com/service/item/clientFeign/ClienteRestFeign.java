package com.service.item.clientFeign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.service.item.entity.Producto;

@FeignClient(name="servicio-producto")
public interface ClienteRestFeign {
	
	@GetMapping("/Listar")
	public List<Producto> listar();
	
	@GetMapping("/ListforId/{id}")
	public Producto detalle(@PathVariable Long id);
}
