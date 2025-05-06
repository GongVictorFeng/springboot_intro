# Spring Boot Introduction

## World Before Spring Boot 
  * Setting up Spring Projects before Spring Boot was Not easy
  * We needed to configure a lot of things before we have production-ready application

### 1 - Dependency Management (pom.xml)
  * Manage frameworks and versions
    * REST API - Spring framework, Spring MVC framework, JSON binding framework, etc
    * Unit Tests - Spring Test, Mockito, JUnit, etc
### 2 - Web Application Configuration (web.xml)
  * Example: Configure DispatcherServlet for Spring MVC
### 3 - Spring Configuration (context.xml)
  * Define your Spring Configuration
    * Component Scan
    * View Resolver
### 4 - Non-Functional Requirements Handling
  * Logging
  * Error Handling
  * Monitoring

## The Most Important Goal of Spring Boot
  * Help you build PRODUCTION-READY apps QUICKLY
    * Build quickly
      * Spring Initializer
      * Spring Boot Starter Projects
      * Spring Boot Auto Configuration
      * Spring Boot DevTools
    * Be Production-Ready
      * Logging
      * Different Configuration for Different Environments
        * Profiles, ConfigurationProperties
      * Monitoring (Spring Boot Actuator)

## Spring Boot Starter Project
  * a lot of frameworks are needed to build application features:
    * Build a REST API: Spring, Spring MVC, Tomcat, JSON conversion, etc
    * Write Unit Tests: Spring Test, Junit, Mockito, etc
  * How to group them and make it easy to build application
    * **Starters**: Convenient **dependency descriptors** for different features
  * Spring Boot provides variety of starter projects:
    * Web Application & REST API - Spring Boot Starter Web (spring-webMVC, spring-web, spring-boot-starter-tomcat,
    spring-boot-starter-json)
    * Unit Tests - Spring Boot Starter Test
    * Talk to database using JPA - Spring Boot Starter Data JPA
    * Talk to database using JDBC - Spring Boot Starter JDBC
    * Secure your web application or REST API - Spring Boot Starter Security

## Spring Boot Auto Configuration
  * lot of configuration is needed to build Spring app:
    * Component Scan, DispatcherServlet, Data Sources, JSON Conversion, etc
  * How to simplify 
    * Auto Configuration: Automated configuration for your app
      * Decided based on:
        * Which frameworks are in the Class Path
        * What is the existing configuration (Annotations)
  * Example: Spring Boot Starter Web
    * Dispatcher Servlet (DispatcherServletAutoConfiguration)
    * Embedded Servlet Container - Tomcat is the default (EmbeddedWebServerFactoryCustomizerAutoConfiguration)
    * Default Error Pages (ErrorMvcAutoConfiguration)
    * Bean <=> Json (JacksonHttpMessageConvertersConfiguration)

## Spring Boot DevTools
  * Increase developer productivity
  * need to restart the server manually for every code change without spring boot DevTools
  * For pom.xml dependency changes, you will need to restart server manually

## Managing Application Configuration using Profiles
  * Applications have different environments: Dev, QA, Stage, Prod, etc
  * Different environments need different configuration:
    * Different Databases
    * Different Web Services
  * How to provide different configuration for different environments
    * Profiles: Environment specific configuration
    * see implementation: https://github.com/GongVictorFeng/springboot_intro/commit/d04878a861f3883067a1fa5e4935729388f880ce
    * Configuration property - for complex application configuration
    * see implementation: https://github.com/GongVictorFeng/springboot_intro/commit/9d9a8e28667fa34c8ea07b8df4d9ee663994c47b
    
    ![managing configuration.png](assets%2Fmanaging%20configuration.png)

## Spring Boot Embedded Servers
  * Deploy application WAR Approach (Old)
    * Step 1: Install Java
    * Step 2: Install Web/Application Server
      * Tomcat/WebSphere/WebLogic etc
    * Step 3: Deploy the application WAR (Web ARchive)
      * Complex to set up
  * Embedded Server - Simpler alternative
    * Step 1: Install Java
    * Step 2: Run JAR file
    * Make JAR not WAR (Credit: Josh Long!)
    * Embedded Server Examples:
      * spring-boot-starter-tomcat
      * spring-boot-starter-jetty
      * spring-boot-starter-undertow

## Monitor Applications using Spring Boot Actuator
  * Monitor and manage application in your production
  * Provides a number of endpoints:
    * beans - Complete list of Spring beans in app
    * health - Application health information 
    * metrics - Application metrics 
    * mappings - Details around Request Mappings

## Understanding Spring Boot vs Spring MVC vs Spring
  * Spring Framework: Dependency Injection
    * Defining dependencies (@Component)
    * Identifying dependencies (Component Scan, etc)
    * Autowiring them in (@Autowired)
    * Just Dependency Injection is Not sufficient 
      * Spring Modules and Spring projects: Extend Spring Eco System
        * Provide good integration with other frameworks (hibernate/JPA, JUnit & Mockito for Unit Testing)
  * Spring MVC (Spring Module): Simplify building web apps and REST API
    * Building web applications with Struts was very complex
    * @Controller, @RestController, @RequestMapping ("/courses")
  * Spring Boot (Spring Project): Build PRODUCT-READY apps Quickly
    * Starter Projects - Make it easy to build variety of applications
    * Autoconfiguration - Eliminate configuration to setup Spring, Spring MVC and other framework
    * Enable non functional requirements (NFRs):
      * Actuator: Enables Advanced Monitoring of applications
      * Embedded Server: No need for separate application servers
      * Logging and Error Handling
      * Profiles and Configuration Properties