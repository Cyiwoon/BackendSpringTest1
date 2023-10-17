package myspring.di.strategy3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import myspring.di.strategy1.dao.UserDaoImpl;
import myspring.di.strategy1.service.UserServiceImpl;
import myspring.di.xml.config.XmlHelloConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = BeanStrategy.class)

public class BeanStrategy3 {
	@Autowired
	UserDaoImpl userdao;
	
	@Autowired
	UserServiceImpl userservice;
	
	@Test
	public void userdao() {
		Assertions.assertEquals(2, userservice.getUserList().size());
	}
	
	
}
