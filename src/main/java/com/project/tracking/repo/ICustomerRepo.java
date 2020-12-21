package com.project.tracking.repo;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.project.tracking.modal.Customer;

@Repository
public interface ICustomerRepo extends
		ReactiveCosmosRepository<Customer, String> {

}
