package kosariev.cs22m.nosql.lab2.repository;

import kosariev.cs22m.nosql.lab2.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {

}
