import by.self.groovy.config.DataConfig
import by.self.groovy.service.PersonImpl
import by.self.groovy.service.UserServiceImpl
import org.springframework.core.io.ClassPathResource

//def url = new ClassPathResource('spring.config').URL;
//def config = new ConfigSlurper().parse(url);

beans {
    xmlns([ctx:'http://www.springframework.org/schema/context'])
    ctx.'component-scan'('base-package':'by.self.groovy')
}

beans {
    userService(UserServiceImpl)
    dataconfig(DataConfig) { bean ->
        
    }
}
