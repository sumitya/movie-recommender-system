# Chapter 1

![img.png](src/main/resources/static/chapter1.png)

# Chapter 2

![img.png](src/main/resources/static/chapter2.png)

# Chapter 3
When `@Component` is put on class, it becomes a bean for container 
![img.png](src/main/resources/static/chapter3_beans.png)

`@Autowired` annotation tells Spring that RecommenderImplementation needs an object of type Filter
![img.png](src/main/resources/static/chapter3_autowired.png)

third thing that Spring requires from the developer, is the location of the beans so that it can find them and autowire the dependencies. The @ComponentScan annotation is used for this purpose.
it scan a specific & subpackages.

`@SpringBootApplication` - This annotation is equivalent to the following three annotations

`@Configuration`, which declares a class as the source for bean definitions

`@EnableAutoConfiguration`, which allows the application to add beans using classpath definitions

`@ComponentScan`, which directs Spring to search for components in the path specified

![img.png](src/main/resources/static/chapter3_springboot.png)

# Chapter 5

![img.png](src/main/resources/static/chapter5_qualifier.png)

`@Qualifier` annotation takes precedence over the `@Primary` annotation. To show this, let’s add the @Primary annotation.

![img.png](src/main/resources/static/chapter5_primary.png)