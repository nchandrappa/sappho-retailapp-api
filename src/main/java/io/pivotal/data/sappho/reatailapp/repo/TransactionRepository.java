package io.pivotal.data.sappho.reatailapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.pivotal.data.sappho.reatailapp.model.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, String> {

}
