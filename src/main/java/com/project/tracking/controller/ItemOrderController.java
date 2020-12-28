package com.project.tracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.tracking.modal.ItemOrder;
import com.project.tracking.service.ItemOrderservice;

@RestController
public class ItemOrderController {

	@Autowired
	private ItemOrderservice service;
	
	@PostMapping(value = "/add")
	public ItemOrder saveItemOrder(@RequestBody ItemOrder itemorder)
	{
		ItemOrder newItemOrder = service.saveItemOrder(itemorder);
		return newItemOrder;
	}
}



