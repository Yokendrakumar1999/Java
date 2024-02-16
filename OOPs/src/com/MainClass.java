package com;

public class MainClass {
  public static void main(String[] args) {
	Sample s1= new Sample();
	System.out.println("Y value is :"+s1.y);
	s1.display();
    System.out.println("X value is :"+Sample.x);
    Sample.test();
}
}
