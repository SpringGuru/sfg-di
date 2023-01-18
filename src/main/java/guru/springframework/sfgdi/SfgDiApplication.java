package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		//git check1
		//git check1
		//git check2
		//git check2
		//git check1


		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);


		System.out.println("-------------------Profile Selection - LANGUAGE");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.getGreeting());

		System.out.println("-------------------Profile Selection - ANIMAL");
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.whichPetIsTheBest());
		
		
		System.out.println("-------------------Primary Bean");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.getGreeting());


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
