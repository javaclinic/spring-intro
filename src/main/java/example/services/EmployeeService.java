package example.services;

import java.util.Collection;

import example.model.Employee;

public interface EmployeeService {
	void hireEmployee(Employee e);
	void hireEmployees(Collection<Employee> employees);
	Collection<Employee> getEmployees();
	Employee getEmployeeDetails(Integer id);
	int countEmployees();
}
