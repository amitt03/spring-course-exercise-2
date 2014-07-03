
Exercise 2
==========

**BookDao** class has **not** changed from the previous exercise <br/>
**Library** class has one change, it now needs a **BookDao** instance in order to execute its logic

1. Create a Spring project that contains the following beans:
    - **BookDao**
    - **Library** with two names: *libraryA* and *libA*
    - **Library** with two names: *libraryB* and *libB*
2. Notice that **Library** is dependent on **BookDao** for its logic!
3. Set the **Library** *open* method to be automatically executed when the library is created
   (in other words, *open* method should not be invoked by your main method code)
4. Inside **Main.main()** instantiate a spring container which includes the above beans, and then:
    - Retrieve *library*" from the container and call *close* method
    - Retrieve the *libA* from the container
    - Verify that the two beans are actually the same bean (use *org.junit.Assert.assertEquals* method)
    - Retrieve the *libraryB* from the container and call *close* method
    - Retrieve the *libB* from the container
    - Verify that the two beans are actually the same bean (use *org.junit.Assert.assertEquals* method)
    - Verify that *libraryA* and *LibraryB* are **NOT** the same bean (use *org.junit.Assert.assertNotEquals* method);

###N O T I C E
- [ ] **Use** @Configuration
- [ ] **DO NOT USE** @Component and such
- [ ] **DO NOT USE** @Autowired
- [ ] **Use** AnnotationConfigApplicationContext
- [ ] Check the log

== Advanced (if you wish)
Create a Pojo and configure it to be a prototype bean.
In the main method, retrieve two instances of that bean and verify that these beans are NOT the same

