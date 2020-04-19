package com.service.item.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.service.item.entity.Item;

@Service
public interface ServiceItem {

	public List<Item> findAllI();
	public Item findByIdI(Long id, Integer cantidad);
}
