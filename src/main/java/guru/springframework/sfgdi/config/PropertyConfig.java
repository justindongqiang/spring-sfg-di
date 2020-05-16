package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.data.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${guru.username}")
    String username;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String dburl;

    @Bean
    public FakeDataSource FakeDataSource() {
        FakeDataSource dataSource = new FakeDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDburl(dburl);
        return dataSource;
    }

// looks like no need to have this bean
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

}
