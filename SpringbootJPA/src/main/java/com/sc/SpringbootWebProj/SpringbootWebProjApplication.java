package com.sc.SpringbootWebProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.annotation.EnableJms;

import com.sc.SpringbootWebProj.impl.*;

@SpringBootApplication
@EnableJpaRepositories("com.sc.SpringbootWebProj")
@EntityScan("com.sc.SpringbootWebProj.entity")
@EnableJms
public class SpringbootWebProjApplication {

	
	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringbootWebProjApplication.class, args);
		/*SearchService service = appContext.getBean(SearchService.class);
		service.search(7);*/
	}
 
}
