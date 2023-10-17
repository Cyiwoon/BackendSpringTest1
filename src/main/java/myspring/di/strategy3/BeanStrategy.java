package myspring.di.strategy3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import myspring.di.strategy1.dao.UserDaoImpl;
import myspring.di.strategy1.service.UserServiceImpl;

@Configuration
public class BeanStrategy {
	
	@Bean
	public UserServiceImpl userService() {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		userServiceImpl.setUserdao(dao());
		return userServiceImpl;
	}
	
	@Bean
	public UserDaoImpl dao() {
		return new UserDaoImpl();
	}
}
