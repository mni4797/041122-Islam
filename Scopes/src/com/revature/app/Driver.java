package com.revature.app;

public class Driver {

	public static void main(String[] args) {
		
		MyObject o = new MyObject();
		MyObject p = new MyObject();
		
		o.number = 10;
		o.printName();
		
		MyObject.name = "Something else";
		
		p.number = 11;
		
		p.printName();
		o.printName();
		
		
		String[] strings = new String[3];
		strings[0] = "Tom";
		strings[1] = "Jerry";
		strings[2] = "Popeye";
		
		o.testVarArgs(strings);
		o.testVarArgs(strings);

	}

}
