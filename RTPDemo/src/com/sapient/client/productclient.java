package com.sapient.client;

import com.sapient.beans.camera;
import com.sapient.beans.computer;
import com.sapient.beans.product;

public class productclient {

	public static void main(String[] args) {
	product[] arr=new product[4];
	arr[0] =new computer(1001,"acer laptop",50000,"intel pentium 5");
	arr[1] =new computer(1002,"dell laptop",30000,"intel pentium 6");
	arr[2] =new camera(1003,"boi laptop",39000,"intel pentium 7");
	arr[3] =new camera(1072,"l laptop",90000,"intel pentium 8");
	for(product p: arr)
	{
		System.out.println(p.display() + " " + p.isExpensive());
	}
	}

}
