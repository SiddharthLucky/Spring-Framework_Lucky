package guru.springframework.config;

import guru.springframework.multiProperties.FDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:dbLogin.Properties")
public class PropertiesRead {

    @Value("${sid.username}")
    String username;
    @Value("${sid.passowrd}")
    String password;
    @Value("${sid.dburl}")
    String dburl;

    @Bean
    public FDataSource fDataSource()
    {
        FDataSource fDataSource = new FDataSource();
        fDataSource.setUserName(username);
        fDataSource.setPassword(password);
        fDataSource.setDburl(dburl);
        return fDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
    {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
