import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.model.Employee;
import com.pluralsight.model.Employer;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee employee = context.getBean(Employee.class);
		
		System.out.println(employee.getEmployer().getEmployerName());
		
		Employer employer = context.getBean(Employer.class);
		
		System.out.println(employer.getEmployee().getEmployeeName());
		
		((AbstractApplicationContext) context).close();
		
	}
}
