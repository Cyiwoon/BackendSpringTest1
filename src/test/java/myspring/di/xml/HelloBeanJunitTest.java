package myspring.di.xml;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
public class HelloBeanJunitTest {
	BeanFactory factory;
	
	@BeforeEach
	void init() {
		//1. Spring Bean Container 객체생성
		factory = new GenericXmlApplicationContext("classpath:spring-beans.xml");
	}
	
	@Test @Disabled
	void 생성자주입테스트() {
		Hello bean = factory.getBean("helloC",Hello.class);
		assertEquals("Hello 생성자",bean.sayHello());
		bean.print();
		
		List<String> names = bean.getNames();
		
		assertEquals(3, bean.getNames().size());
		assertEquals("SpringBoot",names.get(1));

	}
	
	
	
	@Test @Disabled
	void hello() {
		//2. Container가 생성한 Bean을 요청하기
		//Hello hello = new Hello();
		Hello hello1 = (Hello)factory.getBean("hello");
		Hello hello2 = factory.getBean("hello", Hello.class);
		
		//3. HelloBean 레퍼런스 비교 // 싱글톤인지 아닌지 확인
		System.out.println(hello1==hello2);
		assertSame(hello1, hello2); // 주소 비교
		
		assertEquals("Hello 스프링",hello2.sayHello()); // 값의 비교
		hello2.print();
		
		Printer printer = factory.getBean("strPrinter",Printer.class);
		assertEquals("Hello 스프링",printer.toString());
		
		
	}
}
