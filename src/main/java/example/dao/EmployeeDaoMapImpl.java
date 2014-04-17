package example.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import example.model.Employee;

/**
 * Map implementation of the EmployeeDao interface.
 * 
 * @author Admin
 *
 */
public class EmployeeDaoMapImpl implements EmployeeDao {

	private static final Logger LOGGER = Logger.getLogger(EmployeeDaoMapImpl.class.getCanonicalName());
	
	private Map<Integer,Employee> database = new HashMap<>();

	public EmployeeDaoMapImpl() {
		LOGGER.info("Instantiating " + EmployeeDaoMapImpl.class);
	}

	public EmployeeDaoMapImpl(Map<Integer, Employee> database) {
		LOGGER.info("Injecting database into " + this);
		this.database = database;
	}

	public void setDatabase(Map<Integer, Employee> database) {
		LOGGER.info("Injecting database into " + this);
		this.database = database;
	}
	
	@Override
	public void saveEmployee(Employee e) {
		LOGGER.info("DAO call to save employee: " + e);
		database.put(e.getId(), e);
	}

	@Override
	public void deleteEmployee(Employee e) {
		LOGGER.info("DAO call to delete employee: " + e);
		database.remove(e.getId());
	}

	@Override
	public void updateEmployee(Employee e) {
		LOGGER.info("DAO call to update employee: " + e);
		if ( database.get(e.getId()) == null ) throw new RuntimeException("Could not find an employee: " + e);
		database.put(e.getId(), e);
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		LOGGER.info("DAO call to find an employee with id=" + id);
		return database.get(id);
	}

	@Override
	public Collection<Employee> findEmployees() {
		LOGGER.info("DAO call to find all employees.");
		Collection<Employee> result = new ArrayList<>();
		for (Employee e : database.values()) {
				result.add(e);
		}
		return result;
	}
	
	@Override
	public Collection<Employee> findEmployeesByName(String query) {
		LOGGER.info("DAO call to find all employees by name: " + query);
		Collection<Employee> result = new ArrayList<>();
		for (Employee e : database.values()) {
			if ( e.getName() != null && e.getName().contains(query)) {
				result.add(e);
			}
		}
		return result;
	}

	@Override
	public Collection<Employee> findEmployeesByEmail(String query) {
		LOGGER.info("DAO call to find all employees by email: " + query);
		Collection<Employee> result = new ArrayList<>();
		for (Employee e : database.values()) {
			if ( e.getName() != null && e.getEmail().contains(query)) {
				result.add(e);
			}
		}
		return result;
	}

}
