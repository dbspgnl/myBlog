package com.boot;


import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfiguration {
	
	@Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
          .driverClassName("org.mariadb.jdbc.Driver")
          .url("jdbc:mariadb://mymariadb.cwq8smouk6is.ap-northeast-2.rds.amazonaws.com:3306/mydb")
          .username("admin")
          .password("mypassword")
          .build(); 
    }

}
