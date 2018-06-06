package tn.biat.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import tn.biat.entities.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}