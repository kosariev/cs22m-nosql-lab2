package kosariev.cs22m.nosql.lab2.service;

import kosariev.cs22m.nosql.lab2.repository.EmployeeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public EmployeeService employeeService(EmployeeRepository employeeRepository) {
        return new EmployeeService(employeeRepository);
    }
}
