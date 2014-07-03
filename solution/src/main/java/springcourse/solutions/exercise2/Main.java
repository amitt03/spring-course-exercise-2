package springcourse.solutions.exercise2;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        final Library libraryA = context.getBean("libraryA", Library.class);
        final Library libraryB = context.getBean("libraryB", Library.class);
        final Library libA = context.getBean("libA", Library.class);
        final Library libB = context.getBean("libB", Library.class);
        Assert.assertEquals(libraryA, libA);
        Assert.assertEquals(libraryB, libB);
        Assert.assertNotEquals(libraryA, libraryB);
    }
}
