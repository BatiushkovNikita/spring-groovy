package by.self.groovy;

import by.self.groovy.repository.UserRepository;
import by.self.groovy.service.Person;
import by.self.groovy.service.PersonImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;
import org.springframework.stereotype.Repository;

@RunWith(JUnit4.class)
public class GroovyTest {

    private ApplicationContext context;

    @Before
    public void setUp() {
        context = new GenericGroovyApplicationContext("file:config/contextSimple.groovy");
    }

    @Test
    public void test() {
        context.getBean(UserRepository.class);
    }
}
