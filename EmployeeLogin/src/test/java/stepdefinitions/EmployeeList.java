package stepdefinitions;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	private List<Employe> employees;

    public EmployeeList() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee( String name, String designation, String location) {
        Employe newEmployee = new Employe( name,designation,location);
        employees.add(newEmployee);
        System.out.println("Employee name " + name + " with ID " + newEmployee.getEmpID() + ", designation " + designation +  " located in  "+ location + " added successfully.");
        
    }

}
