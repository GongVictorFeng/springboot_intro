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
    ![managing configuration.png](assets%2Fmanaging%20configuration.png)