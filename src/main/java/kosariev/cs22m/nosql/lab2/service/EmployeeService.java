package kosariev.cs22m.nosql.lab2.service;

import kosariev.cs22m.nosql.lab2.model.Employee;
import kosariev.cs22m.nosql.lab2.repository.EmployeeRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeService {
    private static final Employee EMPTY_EMPLOYEE = new Employee();

    private final EmployeeRepository employeeRepository;

    public Employee find(String id) {
        return employeeRepository.findById(id).orElse(EMPTY_EMPLOYEE);
    }

    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee update(String id, Employee employee) {
        Employee employeeRecord = employeeRepository.findById(id).orElse(EMPTY_EMPLOYEE);
        if (employeeRecord.getId() != null) {
            if (employee.getName() != null) {
                employeeRecord.setName(employee.getName());
            }
            if (employee.getAge() > 0) {
                employeeRecord.setAge(employee.getAge());
            }
            employeeRepository.save(employeeRecord);
        }
        return employeeRecord;
    }

    public void delete(String id) {
        employeeRepository.deleteById(id);
    }
}
