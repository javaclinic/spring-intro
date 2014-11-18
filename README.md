# Spring Intro (spring-intro)

* This simple example demonstrates inspiration for Spring Inversion of Control (IoC) container.
* There are two runnable examples: `example.run.MyEmployeeNoSpringApp` and `example.run.MyEmployeeWithSpringApp`
* Both examples leverage a "complicated" service object that contains:
`example.services.EmployeeService` interface,
`example.services.EmployeeServiceImpl` implementation,
`example.dao.EmployeeDao` interface,
`example.dao.EmployeeDaoMapImpl` implementation,
`example.database.MapDatabaseFactory` factory that initializes Map database
* Application instantiates and configures IoC container (with Spring and without Spring).
* Application asks the container for a service instance.
* Application calls service methods on the service.

## Build JAR

* `mvn clean package` - builds a jar file, e.g. `target/spring-intro.jar`

## Run example

* `mvn exec:java -Dexec.mainClass="example.run.MyEmployeeNoSpringApp"` - runs the application with no Spring
* `mvn exec:java -Dexec.mainClass="example.run.MyEmployeeWithSpringApp"` - runs the application with Spring


## Import project to Eclipse
1. Right click in your Project Explorer
2. Select `Import...`
3. Select `Maven`
4. Select `Check out Maven Projects from SCM`
5. Select SCM URL as `git` and type in `https://github.com/javaclinic/spring-intro.git`
6. Select `Finish`
7. Right click on newly created project, e.g. `spring-intro`
8. Select `Maven`
9. Select `Update Project ... ALT+F5`
10. Select `OK`

## Run example in Eclipse
1. Right click on `example.run.MyEmployeeNoSpringApp` or `example.run.MyEmployeeWithSpringApp`
2. Select `Run As`
3. Select `Java Application`
