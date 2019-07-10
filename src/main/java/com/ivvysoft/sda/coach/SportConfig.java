package com.ivvysoft.sda.coach;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.ivvysoft.sda")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
}
