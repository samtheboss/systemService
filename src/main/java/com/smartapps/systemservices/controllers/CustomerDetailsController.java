package com.smartapps.systemservices.controllers;


import com.smartapps.systemservices.Models.Customers.CustomerDetails;
import com.smartapps.systemservices.Services.CustomerDetailsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerDetailsController {
    @Autowired
    private CustomerDetailsServices service;
    @GetMapping("/all")
    public List<CustomerDetails> getAllStockLedgerEntries() {
        return service.getAll();
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveCustomer(@RequestBody CustomerDetails customerDetails) {
        try {
            CustomerDetails savedCustomer = service.saveCustomer(customerDetails);
            if (savedCustomer != null) {
                return new ResponseEntity<>(savedCustomer.getFirstNames()+" Customer saved successfully!", HttpStatus.CREATED);
            } else {
                return new ResponseEntity<>(savedCustomer.getFirstNames()+" Failed to save customer.", HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error occurred: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/customers")
    public ResponseEntity<CustomerDetails> getBalancesByItemCode(@RequestParam Long customerNumber) {
        CustomerDetails customerDetails = service.getCustomerByCustomerNumber(customerNumber);
        if (customerDetails == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customerDetails, HttpStatus.OK);
    }
    @GetMapping("/search")
    public ResponseEntity<List<CustomerDetails>> searchCustomers(@RequestParam String name) {
        List<CustomerDetails> customers = service.searchCustomersByName(name);
        if (customers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
}
