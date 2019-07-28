package com.tahghighdoost.my_first_application.bootstrap;

import com.tahghighdoost.my_first_application.domain.Customer;
import com.tahghighdoost.my_first_application.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading customer data");

        Customer c1 = new Customer();
        c1.setFirstname("mahdi");
        c1.setLastname("TD");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("ali");
        c2.setLastname("TD");
        customerRepository.save(c2);


        Customer c3 = new Customer();
        c3.setFirstname("mohammad");
        c3.setLastname("TD");
        customerRepository.save(c3);

        System.out.println("Customer data Saved :" + customerRepository.count());


    }
}
