angular-rest-springsecurity-jpa-blueprint
==========================================

An example AngularJS Application that uses a Spring Security protected Jersey REST backend based on Hibernate/JPA.

About
-----

The projects aim is to demonstrate the Java implementation of a simple REST interface which is used by an AngularJS application. The following topics are covered:

* A relational database that holds news entries and users.
* A REST service that exposes the data in the database.
* Authentication and authorization against the REST service.
* A Simple AngularJS application that allows users to view or edit news entries depending on their role.
* A responsive design.
 

Technologies
------------

* [AngularJS](http://angularjs.org/)
* [Bootstrap](http://getbootstrap.com/)
* [Jersey](https://jersey.java.net/)
* [Spring Security](http://projects.spring.io/spring-security/)
* [Hibernate](http://hibernate.org/)
* [MYSQL]

Running
-------

Make sure [Maven](http://maven.apache.org/) >= 2.2.1 is installed on your system. Go into the project dir and type `mvn jetty:run`, then point your browser to `http://localhost:8080`.
