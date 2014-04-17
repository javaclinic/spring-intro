package example.services;

import java.util.Collection;

import example.dao.EmployeeDao;
import example.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao;
	
	public EmployeeServiceImpl() {
	}
	
	public EmployeeServiceImpl(EmployeeDao dao) {
		this.dao = dao;
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public void hireEmployee(Employee e) {
		dao.saveEmployee(e);
	}
	
	@Override
	public void hireEmployees(Collection<Employee> list) {
		for (Employee e : list) {
			dao.saveEmployee(e);
		}
	}

	@Override
	public Collection<Employee> getEmployees() {
		return dao.findEmployees();
	}

	@Override
	public int countEmployees() {
		return dao.findEmployees().size();
	}

	@Override
	public Employee getEmployeeDetails(Integer id) {
		return dao.findEmployeeById(id);
	}
}
