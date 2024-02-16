package dsa;

import java.util.Iterator;

public class StackBacket {

	static char[]stack;
	static int top=-1;
	static void push(char ele) {
		top++;
		stack[top]=ele;
	}
	static void pop() {
		top--;
	} 
	public static void main(String[] args) {
		String s="(()(((()))(((((()))))";
		stack=new char[s.length()];
		boolean flag=true;
		
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='(') {
				push('(');
			}
			else if (s.charAt(i)==')'&&top!=-1){
				pop();
			}
			else {
				flag=false; break;
			}
		}
		System.out.println(top==-1&&flag==true?"Balanced":"UnBalanced");
	}
}
