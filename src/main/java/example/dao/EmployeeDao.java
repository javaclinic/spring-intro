package example.dao;

import java.util.Collection;

import example.model.Employee;

public interface EmployeeDao {
	
	// CRUD methods
	void saveEmployee(Employee e);
	void deleteEmployee(Employee e);
	void updateEmployee(Employee e);
	
	// Finder methods
	Employee findEmployeeById(Integer id);
	Collection<Employee> findEmployees();
	Collection<Employee> findEmployeesByName(String query);
	Collection<Employee> findEmployeesByEmail(String query);

}
