package com.sapient.beans;

public class camera extends product{
private String lens;

public camera(int pid, String pname, double price, String lens) {
	super(pid, pname, price);
	this.lens = lens;
}

@Override
public String isExpensive() {
	
		if(getPrice()>=10000)
		return "costlier";
		else
			return "average";
}

@Override
public String display() {
	
	return super.display() + " " +lens;
}

}
