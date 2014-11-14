package example.run;

import java.util.Collection;

import example.model.Employee;
import example.nospring.configuration.NoSpringBeanFactory;
import example.services.EmployeeService;

/**
 * This runnable example demonstrates a factory that instantiates, configures and wires objects,
 * similarly to what Spring BeanFactory provides, but with No-Spring :)
 * 
 * @author nevenc
 *
 */
public class MyEmployeeNoSpringApp {

    public static void main(String[] args) {

        // Instantiating NoSpringBeanFactory, our primitive IoC container (object factory)
        NoSpringBeanFactory factory = new NoSpringBeanFactory();

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
