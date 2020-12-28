package com.project.tracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.azure.spring.data.cosmos.exception.DatabaseCreationException;
import com.project.tracking.exception.CustomException;
import com.project.tracking.modal.Customer;
import com.project.tracking.modal.CustomerValidator;
import com.project.tracking.repo.ICustomerRepo;

@Service
public class CustomerService {

	@Autowired 
	private ICustomerRepo repository;
	
	@Autowired
	private CustomerValidator validate;

	public Flux<Customer> getCustomerList() {

		Flux<Customer> customerList = repository.findAll();
		return customerList;
	}
	
	public Customer saveCustomer(Customer customer) throws DatabaseCreationException, CustomException {
	
		boolean statuscustname = validate.isequalcustname(customer.getCustomername());
		boolean status = validate.isValidMobilenumber(customer.getMobilenumber());
		boolean statusemail = validate.isValidEmail(customer.getEmail());
		boolean statuspincode = validate.isValidPincode(customer.getPincode());
		
		if(statuscustname && status && statusemail && statuspincode==true){
			
		Mono<Customer> savedCustomer = repository.save(customer);
		return savedCustomer.block();
		
		}
		return customer;
	}
}





