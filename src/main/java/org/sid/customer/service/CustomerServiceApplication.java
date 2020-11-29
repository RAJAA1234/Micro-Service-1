package org.sid.customer.service;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class CustomerServiceApplication {

 
	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(new Customer(null,"rajaa","rajaa@gmail.com"));
			customerRepository.save(new Customer(null,"ali","ali@gmail.com"));
			customerRepository.save(new Customer(null,"selma","selma@gmail.com"));	
		    customerRepository.findAll().forEach(c->{
			   System.out.println(c.toString());
			
			
		
		});
		
		
		
		
	};

}
}