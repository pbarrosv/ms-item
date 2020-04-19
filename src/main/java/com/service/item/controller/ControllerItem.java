package com.service.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.item.entity.Item;
import com.service.item.service.ServiceItem;

@RestController
public class ControllerItem {

	@Autowired
	@Qualifier("serviceFeign")
	private ServiceItem serviceItem;
	
	@GetMapping("/listarI")
	public List<Item> listarI(){
		return serviceItem.findAllI();
	}
	
	@GetMapping("/verI/{id}/cantidad/{cantidad}")
	public Item detalleI(@PathVariable Long id,@PathVariable Integer cantidad) {
		return serviceItem.findByIdI(id, cantidad);
	}
}
