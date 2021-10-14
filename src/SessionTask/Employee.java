package SessionTask;

import java.io.Serializable;

public class Employee implements Serializable, Comparable<Employee> {

	private static final long serialVersionUID = 1L;

	public static Object project;
	
	private int empid;
	private String ename;
	double esal;
	private int dno;
	
	public Employee() {
		
	}

	public Employee(int empid, String ename, double esal, int dno) {
		this.empid = empid;
		this.ename = ename;
		this.esal = esal;
		this.dno = dno;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}
	
	public int compareTo(Employee e) {
		if(this.getEsal()>e.getEsal())
			return 1;
		else if(this.getEsal()<e.getEsal())
			return -1;
		return 0;
		
	}
	
}