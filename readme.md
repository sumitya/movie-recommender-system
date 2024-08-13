# Chapter 1

![img.png](src/main/resources/static/lesson1.png)

# Chapter 2

![img.png](src/main/resources/static/lesson2.png)

# Chapter 3
When `@Component` is put on class, it becomes a bean for container 
![img.png](src/main/resources/static/lesson3_beans.png)

`@Autowired` annotation tells Spring that RecommenderImplementation needs an object of type Filter
![img.png](src/main/resources/static/lesson3_autowired.png)

third thing that Spring requires from the developer, is the location of the beans so that it can find them and autowire the dependencies. The @ComponentScan annotation is used for this purpose.
it scan a specific & subpackages.

`@SpringBootApplication` - This annotation is equivalent to the following three annotations

`@Configuration`, which declares a class as the source for bean definitions

`@EnableAutoConfiguration`, which allows the application to add beans using classpath definitions

`@ComponentScan`, which directs Spring to search for components in the path specified

![img.png](src/main/resources/static/lesson3_springboot.png)

# Chapter 5

![img.png](src/main/resources/static/lesson5_qualifier.png)

`@Qualifier` annotation takes precedence over the `@Primary` annotation. To show this, let’s add the @Primary annotation.

![img.png](src/main/resources/static/lesson5_primary.png)

If there is no `@Qualifier` specified on Components, but there is a `@Primary` mention, 
Component with `@Primary` will be injected as dependency.

# Chapter 7 
Bean scopes - bean scope refers to the lifecycle and the visibility of beans. It tells how long the bean lives, how many instances of the bean are created, and how the bean is shared. 
The singleton and prototype scopes can be used in any application while the last four scopes are only available for a web application.
![img.png](src/main/resources/static/lesson7_bean_scope.png)

![img.png](src/main/resources/static/lesson7_singleton_bean.png)

![img.png](src/main/resources/static/lesson7_prototype_bean.png)

# Chapter 8
Mixing singleton and prototype Beans
![img.png](src/main/resources/static/lesson8_singleton_bean.png)

![img.png](src/main/resources/static/lesson8_prototype_bean.png)

![img.png](src/main/resources/static/lesson8_proxy_bean.png)