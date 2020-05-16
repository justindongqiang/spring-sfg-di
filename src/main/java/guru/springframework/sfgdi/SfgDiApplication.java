package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructionInjectionController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.data.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		//MyController myController = (MyController) ctx.getBean("myController");
		MyController myController = ctx.getBean(MyController.class); // this is better

		System.out.println("-------------- Primary");
		System.out.println(myController.sayHello());

		System.out.println("-------------- Constructor");
		ConstructionInjectionController controller = (ConstructionInjectionController) ctx.getBean("constructionInjectionController");
		System.out.println(controller.getGreeting());

		System.out.println("-------------- Datasource");
		FakeDataSource dataSource = ctx.getBean(FakeDataSource.class);
		String user = dataSource.getUsername();
		String pass = dataSource.getPassword();
		String dburl = dataSource.getDburl();
		System.out.printf("user=%s pass=%s db=%s", user, pass, dburl);

	}
}
