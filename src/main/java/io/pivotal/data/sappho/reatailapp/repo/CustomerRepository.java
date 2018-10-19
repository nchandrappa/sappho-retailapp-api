package io.pivotal.data.sappho.reatailapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.pivotal.data.sappho.reatailapp.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {

}
