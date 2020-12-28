package com.project.tracking.repo;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.project.tracking.modal.ItemOrder;

public interface IItemOrderRepo extends
                   ReactiveCosmosRepository<ItemOrder, String> {

}
