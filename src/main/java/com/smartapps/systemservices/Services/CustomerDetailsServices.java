package com.smartapps.systemservices.Services;

import com.smartapps.systemservices.Models.Customers.CustomerDetails;
import com.smartapps.systemservices.Repo.CustomerDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerDetailsServices {
    @Autowired
    private CustomerDetailsRepository repository;

    public CustomerDetails saveCustomer(CustomerDetails customerDetails) {
        System.out.println(customerDetails.toString());
        return repository.save(customerDetails);
    }
    public List<CustomerDetails> getAll() {
        return repository.findAll();
    }
    public CustomerDetails getCustomerByCustomerNumber(Long customerNumber){
        return repository.findAllByCustomerNumber(customerNumber);
    }
    public List<CustomerDetails> searchCustomersByNamef(String name) {
        return repository.searchByFirstNameOrSurname(name, name);
    }
    public List<CustomerDetails> searchCustomersByName1(String searchTerm) {
        String[] words = searchTerm.trim().split("\\s+"); // Split by space
        String word1 = words.length > 0 ? words[0] : "";
        String word2 = words.length > 1 ? words[1] : word1; // Use the same word if only one exists

        return repository.searchByFirstNameOrSurname(word1, word2);
    }
    public List<CustomerDetails> searchCustomersByName(String searchTerm) {
        searchTerm = searchTerm.trim();

        // First, check for an exact match
        List<CustomerDetails> exactMatch = repository.findExactMatch(searchTerm);
        if (!exactMatch.isEmpty()) {
            return exactMatch; // Return only the exact match if found
        }

        // If no exact match, perform partial search
        String[] words = searchTerm.split("\\s+"); // Split by space
        String word1 = words.length > 0 ? words[0] : "";
        String word2 = words.length > 1 ? words[1] : word1; // Use same word if only one exists

        return repository.searchByFirstNameOrSurname(word1, word2);
    }
}
