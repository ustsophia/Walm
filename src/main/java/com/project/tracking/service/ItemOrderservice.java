package com.project.tracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.tracking.modal.ItemOrder;
import com.project.tracking.repo.IItemOrderRepo;

import reactor.core.publisher.Mono;

@Service
public class ItemOrderservice {
	
	@Autowired 
	private IItemOrderRepo repository;
	
	public ItemOrder saveItemOrder( ItemOrder itemorder)
	{
		itemorder.setStatus("NEW");
		Mono<ItemOrder> savedItemOrder = repository.save(itemorder);
		return savedItemOrder.block();
		}
}



