package org.company.google;

public class MainEmployee {
   public static void main(String[] args) {
	Employee e1=new Employee(501,"VJ",30003);
	Employee e2=new Employee(502,"NR",30003);
	Employee e4=new Employee(503,"HK",30003);
	Employee e5=new Employee(504,"GP",30003);
	Employee e6=new Employee(505,"Vikcy",30003);
	Employee e3=new Employee(506,"Dina",30003);
	
	Employee arrEmp[]=new Employee[6];
	arrEmp[0]=e1;
	arrEmp[1]=e2;
	arrEmp[2]=e3;
	arrEmp[3]=e4;
	arrEmp[4]=e5;
	arrEmp[5]=e6;
	System.out.println("EmpID \tName \tSalary");
	for(Employee ele:arrEmp) {
		
		System.out.println(ele.id+"\t"+ele.name+"\t"+ele.sal);
	}
	
	// For Object
	Object [] arrEmp1=new Object[5];
	arrEmp1[0]=e1;
	arrEmp1[1]=e2;
	arrEmp1[2]=e3;
	arrEmp1[3]=e4;
	arrEmp1[4]=e5;
	System.out.println("EmpID\tName\tsalary\t");
	for(Object obj:arrEmp1) {
		Employee emp=(Employee)obj; //downCasting
		System.out.println(emp.id+"\t"+emp.name+"\t"+emp.sal);
		
		
	}
	
	
}
}
