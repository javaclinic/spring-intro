package example.run;

import java.util.Collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import example.model.Employee;
import example.services.EmployeeService;

/**
 * This runnable example demonstrates Spring BeanFactory, a factory that instantiates, configures and wires objects.
 * 
 * @author nevenc
 *
 */
public class MyEmployeeWithSpringApp {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        // Instantiating Spring BeanFactory, an object factory that is configured in an XML file
        BeanFactory factory = new ClassPathXmlApplicationContext("myfactory.xml");

        // Ask container for an instance of EmployeeService
        EmployeeService service = factory.getBean("myservice", EmployeeService.class);

        // Use the bean
        Collection<Employee> employees = service.getEmployees();
        for(Employee e : employees) {
            System.out.println(e);
        }

        // Use the bean
        System.out.println("There are exactly: " + service.countEmployees() + " employee(s).");

    }

}
