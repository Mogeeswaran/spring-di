package mogee.springframework.springdi;

import ch.qos.logback.core.net.SyslogOutputStream;
import mogee.springframework.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Properties;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringDiApplication.class, args);

		I8nController i8nController = (I8nController)ctx.getBean("i8nController");
		System.out.println(i8nController.sayHello());

		MyController myController = (MyController)ctx.getBean("myController");
		System.out.println("--------Primary");
		System.out.println(myController.sayHello());


		System.out.println("--------property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
