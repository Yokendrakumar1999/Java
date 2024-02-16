package org.company.google;

public class Employee {
   int id;
   double sal;
   String name;
public Employee(int id, String name,double sal) {
	this.id = id;
	this.sal = sal;
	this.name = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", sal=" + sal + ", name=" + name + "]";
}
}
