package patika;

public class Motor {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("mehmet",7500,50,2014);
		Employee e2 = new Employee("selin",6000,36,2011);
		Employee e3 = new Employee("ali",12000,48,2004);
		Employee e4 = new Employee("zeynep",7000,60,2020);
		
		e1.toString();
		e2.toString();
		e3.toString();
		e4.toString();
	}
	
}

class Employee {
	

	public String name;
	public int salary;
	public int workHours;
	public int hireYear;
	
	
	public Employee (String _name, int _salary, int _workHours, int _hireYear) 
	{
		name=_name;
		salary = _salary;
		workHours = _workHours;
		hireYear = _hireYear;
	}
	
	public float tax() 

	{
		if (salary>1000) {
			return salary*3/100;
		}
		else 
		{
			return 0;
		}
		
	}
	public float bonus() 
	{
		if (workHours>40) {
			return (workHours-40)*30;
		}
		else {
			return 0;
		}
	}
	public double raiseSalary() 
	{ 	
		int workYears = 2021 - hireYear;
		
		if (workYears<10) {
			return 0.05*salary;
		}
		if (workYears>9 && workYears<20) {
			return 0.10*salary;
		}
		if (workYears>20) {
			return 0.15*salary;
		}
		else return 0;
		
	}
	public String toString() {
		
		System.out.print
		(
				"name: " + name                                      +"\n" 
				+"salary: " + salary                                          +"\n" 
				+"workHours: " + workHours                                    +"\n"
				+"hireYear: " + hireYear                                      +"\n" 
				+"tax: " + tax()                                              +"\n" 
				+"bonus: " + bonus()                                          +"\n"  
				+"maaþ artýþý: " +  raiseSalary()                             +"\n"
				+"vergi ve bonus: " + ( salary + bonus()-tax() )              +"\n"
				+"toplam maaþ: " + ( salary+ raiseSalary() + bonus()-tax() )  +"\n"
				+"\n"+"\n"+"\n"
						           
				
		);
		return "worked";
	}
}

