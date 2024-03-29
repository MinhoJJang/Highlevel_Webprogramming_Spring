package gcu.backend.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import gcu.backend.server.model.Employee;

@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
