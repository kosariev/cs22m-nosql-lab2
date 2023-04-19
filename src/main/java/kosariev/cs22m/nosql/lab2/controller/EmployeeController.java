package kosariev.cs22m.nosql.lab2.controller;

import kosariev.cs22m.nosql.lab2.model.Employee;
import kosariev.cs22m.nosql.lab2.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/get")
    public Iterable<Employee> find() {
        return employeeService.findAll();
    }

    @GetMapping("/get/{id}")
    public Employee find(@PathVariable String id) {
        return employeeService.find(id);
    }

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @PostMapping("/save/{id}")
    public Employee update(@PathVariable String id, @RequestBody Employee employee) {
        return employeeService.update(id, employee);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        employeeService.delete(id);
    }
}
