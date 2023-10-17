package myspring.di.strategy1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.geom.GeneralPath;

import org.springframework.beans.factory.BeanFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.di.strategy1.dao.UserDao;
import myspring.di.strategy1.service.UserService;

public class MyBeanJunitTest {
	BeanFactory factory;
	
	@BeforeEach
	void init() {
		factory = new GenericXmlApplicationContext("classpath:spring-beans-strategy.xml");
	}
	
	@Test
	void userdao() {
		UserDao userdao1 = (UserDao)factory.getBean("dao");
		UserService userservice = (UserService)factory.getBean("service");
		assertEquals(2, userservice.getUserList().size());
	}
}
