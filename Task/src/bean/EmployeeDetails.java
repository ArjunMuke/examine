package bean;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDetails {
	ArrayList<Employee> Employeeshare = new ArrayList<>();

	public void addEmployee(Employee employee) {
		Employeeshare.add(employee);

	}

	public void removeEmployee(int id, String name) {
		for (Iterator iterator = Employeeshare.iterator(); iterator.hasNext();) {
			Employee employee1 = (Employee) iterator.next();
			if ((employee1.getId() == id) || (employee1.getName().equals(name))) {
				iterator.remove();
			}
		}

	}

	public void showEmployee() {
		for (Employee employee1 : Employeeshare) {
			System.out.println("Employee ID : " + employee1.getId() + "Employee Name : " + employee1.getId()
					+ " Employee Salary :" + employee1.getSalary());
		}
	}

	public void searchEmployeeByName(String name) {
		for (Employee employee2 : Employeeshare) {
			if (employee2.getName().equals(name))
				System.out.println("Employee Name :" + employee2.getName() + "Employee ID : " + employee2.getId());
		}
	}

	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		Employee e1 = new Employee("Mukesh", 1, 12345);
		Employee e2 = new Employee("Arjun", 2, 15000);
		Employee e3 = new Employee("Krishna", 3, 16000);
		emp.addEmployee(e1);
		emp.addEmployee(e2);
		emp.addEmployee(e3);
		System.out.println();
		emp.showEmployee();
		emp.removeEmployee(1, "Mukesh");
		System.out.println();
		emp.showEmployee();
		emp.searchEmployeeByName("Arjun");
	}
}