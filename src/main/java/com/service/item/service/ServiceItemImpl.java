package com.service.item.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.item.clientFeign.ClienteRestFeign;
import com.service.item.entity.Item;

@Service("serviceFeign")
public class ServiceItemImpl implements ServiceItem{

	@Autowired
	private  ClienteRestFeign clienteRestFeign;
	
	@Override
	public List<Item> findAllI() {
		return clienteRestFeign.listar().stream().map(p-> new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item findByIdI(Long id, Integer cantidad) {
		return new Item(clienteRestFeign.detalle(id), cantidad);
	}

}
