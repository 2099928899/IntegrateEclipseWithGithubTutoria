package test;
import static org.junit.Assert.*;
import org.junit.Test;


import main.calc;
class calctest {

	@Test
public void testadd() {
		calc d=new calc();
		int result =d.add(5, 10);
	assertTrue(15==result);	
	
	}
@Test(expected=ArithmeticException.class)
public void testmessage () {
	calc d=new calc() ;
	d.neg(-5, -10);
	System.out.println ("Inside testmessage");
}

}
