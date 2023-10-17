package myspring.di.strategy2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import myspring.di.strategy2.dao.UserDao;
import myspring.di.strategy2.service.UserService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:spring-benas-strategy-annot.xml")
public class MySpringTest {
	@Autowired
	UserService userservice;
	
	@Autowired
	UserDao userdao;
	
	@Test
	public void userdao() {
		Assertions.assertEquals(2, userservice.getUserList().size());
	}

}
