package main;

import java.io.IOException;
import java.util.Scanner;

public class calc {
	public static int add (int x,int y) {
	
return x+y ;
}
	public void neg (int x,int y) {
		
		if ((x+y)<0)throw new ArithmeticException();
	}
	
	
	
	public static void main (String []args)throws IOException{
		int h,a ,d ;
		Scanner newinput =new Scanner (System.in);
		a=newinput.nextInt();
		d=newinput.nextInt();
		if (a>0 &&d>0){
			h=add(a,d);
			System.out.print(h);
		}
		else {System.out.println("d<0 or a<0");
	}
}}