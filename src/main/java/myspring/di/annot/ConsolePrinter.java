package myspring.di.annot;

import org.springframework.stereotype.Component;

@Component("consolePrinter") //(파일명 첫글자 소문자로)
public class ConsolePrinter implements Printer {
	public ConsolePrinter() {
		System.out.println(this.getClass().getName() + "생성자 호출됨!!");
	}
	public void print(String message) {
		System.out.println(message);
	}
}
