package example.nospring.configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import example.dao.EmployeeDao;
import example.dao.EmployeeDaoMapImpl;
import example.database.MapDatabaseFactory;
import example.model.Employee;
import example.services.EmployeeService;
import example.services.EmployeeServiceImpl;

/**
 * Factory that configures and creates bean objects. It illustrates what Spring BeanFactory does.
 * 
 * @author nevenc
 *
 */
public class NoSpringBeanFactory {

    private static final Logger LOGGER = Logger.getLogger(NoSpringBeanFactory.class.getCanonicalName());
    private Map<String,Object> beans;

    public NoSpringBeanFactory() {
        LOGGER.info("Instantiating " + this.getClass());
        this.configure();
    }

    public void configure() {
        LOGGER.info("Initializing " + this.getClass());
        beans = new HashMap<>();
        beans.put("database", getDatabase());
        beans.put("mydao", getEmployeeDao());
        beans.put("myservice", getEmployeeService());
    }

    public Object getBean(String name) {
        LOGGER.info("Requesting bean: " + name);
        return beans.get(name);
    }

    public <T> T getBean(String name, Class<T> requiredType) {
        LOGGER.info("Requesting bean: " + name + " of type: " + requiredType);
        Object o = beans.get(name);
        return requiredType.cast(o);
    }

    @SuppressWarnings("unchecked")
    private EmployeeDao getEmployeeDao() {
        LOGGER.info("Instantiating EmployeeDao instance.");
        return new EmployeeDaoMapImpl((Map<Integer,Employee>)beans.get("database"));
    }

    private EmployeeService getEmployeeService() {
        LOGGER.info("Instantiating EmployeeService instance.");
        return new EmployeeServiceImpl((EmployeeDao)beans.get("mydao"));
    }

    private Map<Integer,Employee> getDatabase() {
        LOGGER.info("Instantiating database (Map) instance.");
        return MapDatabaseFactory.getSampleDatabase();
    }

}
