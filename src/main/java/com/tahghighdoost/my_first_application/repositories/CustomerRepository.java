package com.tahghighdoost.my_first_application.repositories;

import com.tahghighdoost.my_first_application.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
