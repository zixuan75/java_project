package com.applet.source;
final class packageinfo {
	String info="";
	public void init() {
		info="Created on: 2017-10-20";
		boolean printInit=false;
		if (printInit)
			print();
	}
	public void print() {
		System.out.println(info);
	}
}