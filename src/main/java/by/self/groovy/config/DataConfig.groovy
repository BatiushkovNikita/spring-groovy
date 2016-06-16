package by.self.groovy.config

import groovy.sql.Sql
import org.springframework.core.io.ClassPathResource
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.jdbc.datasource.DriverManagerDataSource

import javax.sql.DataSource
import java.sql.Driver

@EnableJpaRepositories
class DataConfig {
    def url = new ClassPathResource('data.properties').URL;
    def config = new ConfigSlurper().parse(url);

    Sql sql = Sql.newInstance((config.db.url + '/' + config.db.name), config.db.username, config.db.password, config.db.driver);
    DriverManagerDataSource dataSource = sql.getDataSource();

   // DriverManagerDataSource dataSource = new DriverManagerDataSource()
}
