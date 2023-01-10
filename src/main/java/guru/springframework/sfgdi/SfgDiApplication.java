package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {


		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHallo();
		System.out.println(greeting);


		System.out.println("-------------------Property");
		PropertyInjectedController property = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(property.getGreeting());


		System.out.println("-------------------Setter");
		SetterInjectedController setter = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setter.getGreeting());


		System.out.println("-------------------Constructor");
		ConstructorInjectedController constructor = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructor.getGreeting());
	}

}
