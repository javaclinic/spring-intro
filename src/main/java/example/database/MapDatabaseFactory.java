package example.database;

import java.util.HashMap;
import java.util.Map;

import example.model.Employee;

/**
 * Helper class to initialize our java.util.Map<Integer,Employee> database.
 * 
 * @author nevenc
 *
 */
public class MapDatabaseFactory {
	
	public static Map<Integer,Employee> getSampleDatabase() {
		Map<Integer,Employee> database = new HashMap<>();
		database.put(1, new Employee(1,"John Doe", "john.doe@email.com"));
		database.put(2, new Employee(2,"Jane Doe", "jane.doe@email.com"));
		database.put(3, new Employee(3,"Jenn Doe", "jenn.doe@email.com"));
		database.put(4, new Employee(4,"Jack Doe", "jack.doe@email.com"));
		return database;
	}

}
