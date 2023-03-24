package com.sufian.spboot;

import com.sufian.spboot.model.Employee;
import com.sufian.spboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpbootApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Abu");
		employee.setLastName("Sufian");
		employee.setEmailId("hisam@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Abdul");
		employee1.setLastName("Siam");
		employee1.setEmailId("sami@gmail.com");
		employeeRepository.save(employee1);
	}
}
