### Spring + Hibernate + MySQL 
      
Getting Hibernate working with MySQL and Spring ORM on Spring Boot (non-JDBC).
DB authentication is done via basic user/pass.

Spring Boot 2.3.0  
OpenJDK 11.0.7  

Dependencies: 
- [MySQL ConnectorJ 8.0.20](https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.20)  
- [Apache DBCP 2.7.0](https://mvnrepository.com/artifact/org.apache.commons/commons-dbcp2/2.7.0) (DBCP over Spring's DriverManagerDataSource for efficient connection pooling)
- [Apache Pool 2.8.0](https://mvnrepository.com/artifact/org.apache.commons/commons-pool2/2.8.0)
- [Spring ORM 5.2.7](https://mvnrepository.com/artifact/org.springframework/spring-orm/5.2.7.RELEASE)
- [Hibernate Core 5.4.17](https://mvnrepository.com/artifact/org.hibernate/hibernate-core/5.4.17.Final)

#### Setup

Add lines to `src\main\java\com\philam18\demohibernate\mysql.properties`:
```
db.host=<...>
db.port=<...>
db.username=<...>
db.password=<...>
db.connectionPoolInitialSize=<...>
db.connectionPoolMaxTotal=<...>
hibernate.dialect=<...>
```
Refer to [here](https://docs.jboss.org/hibernate/orm/5.2/javadocs/org/hibernate/dialect/package-summary.html) for help setting the `hibernate.dialect`.  


#### Resources
- [MySQL Connector Java reference](https://dev.mysql.com/doc/connector-j/5.1/en/connector-j-usagenotes-spring-config.html)
- [Hibernate 5.2.x docs](https://docs.jboss.org/hibernate/orm/5.2/javadocs/overview-summary.html)
- [Spring 5.2.7 reference](https://docs.spring.io/autorepo/docs/spring-framework/5.2.7.RELEASE/spring-framework-reference/data-access.html#orm-hibernate)



