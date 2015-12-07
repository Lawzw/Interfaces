package interfaces;

public class Employee implements Comparable<Employee>{

	private String name;
	private double salary;
	public Employee(String n,double s){
		name=n;
		salary=s;
	}
	public String getName(){
		return name;
	}
	public double getSalay(){
		return salary;
	}
	public void raiseSalary(double byPrecent){
		double raise=salary*byPrecent/100;
		salary+=raise;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Double.compare(salary, o.salary);
	}

}
