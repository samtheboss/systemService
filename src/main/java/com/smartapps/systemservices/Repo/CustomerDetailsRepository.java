package com.smartapps.systemservices.Repo;

import com.smartapps.systemservices.Models.Customers.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Long> {
    List<CustomerDetails>  findAll();
   CustomerDetails findAllByCustomerNumber(Long customerNumber);
   List<CustomerDetails> findAllByFirstNamesAndSurname(String firstNames, String surname);
   List<CustomerDetails> findAllByFirstNamesContainingIgnoreCaseOrSurnameContainingIgnoreCase(String firstNames, String surname);
    @Query("SELECT c FROM CustomerDetails c WHERE LOWER(c.firstNames) = LOWER(:name) OR LOWER(c.surname) = LOWER(:name)")
    List<CustomerDetails> findExactMatch(@Param("name") String name);
   @Query("SELECT c FROM CustomerDetails c WHERE " +
            "LOWER(c.firstNames) LIKE LOWER(CONCAT('%', :word1, '%')) OR " +
            "LOWER(c.surname) LIKE LOWER(CONCAT('%', :word1, '%')) OR " +
            "LOWER(c.firstNames) LIKE LOWER(CONCAT('%', :word2, '%')) OR " +
            "LOWER(c.surname) LIKE LOWER(CONCAT('%', :word2, '%'))")
    List<CustomerDetails> searchByFirstNameOrSurname(@Param("word1") String word1,
                                                     @Param("word2") String word2);
}

