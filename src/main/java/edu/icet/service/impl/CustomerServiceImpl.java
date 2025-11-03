package edu.icet.service.impl;

import edu.icet.model.Customer;
import edu.icet.repository.CustomerDao;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;
    @Override
    public void addCustomer(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        
        List<Customer> all = customerDao.findAll();
        return all;
    }

    @Override
    public Customer findById(String id) {
        Optional<Customer> byId = customerDao.findById(id);
        return byId.get();

    }

    @Override
    public List<Customer> findByName(String name) {
        return customerDao.findByName(name);
    }
}
