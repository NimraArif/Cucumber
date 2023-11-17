package stepdefinitions;

public class Employe {
	
	private int empID;
	private String name; 
	private String designation;
	private String location; 
	private static int nextEmployeeId = 1;
	EmployeeList list = new EmployeeList();
	
	public Employe( String name, String designation, String location) {
		super();
		this.empID = nextEmployeeId++;
		this.name = name;
		this.designation = designation;
		this.location = location;
	}

	// Getters and Setters
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void addemployee(String name, String designation, String location) {
		list.addEmployee(name, designation, location);
		
	}
	

}
