package com.project.tracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.azure.spring.data.cosmos.exception.DatabaseCreationException;
import com.project.tracking.exception.CustomException;
import com.project.tracking.modal.Customer;
import com.project.tracking.service.CustomerService;

import reactor.core.publisher.Flux;

	@RestController
	public class CustomerController {

		@Autowired
		private CustomerService service;
	
	@PostMapping(value = "/save")
	public Customer saveCustomer(@RequestBody Customer customer) throws DatabaseCreationException, CustomException {
		Customer newCustomer = service.saveCustomer(customer);
		return newCustomer;
	}
	@GetMapping(value = "/all")
	public Flux<Customer> getCustomerList() {
		Flux<Customer> custList = service.getCustomerList();
		return custList;
	}
}
	

	