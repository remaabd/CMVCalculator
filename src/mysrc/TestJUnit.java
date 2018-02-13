package mysrc;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnit {
	@Test
	public void testAdd() {
		double a= 4.0, b= -5.0;
	      double expected = -1.0;
		double result= Calcmodel.add(a,b);
		assertEquals(expected,result,0.00001);
	      
	   }
	@Test
	public void testMul() {
		double a= 4.0, b= -5.0;
	      double expected = -20.0;
		double result= Calcmodel.mul(a,b);
		assertEquals(expected,result,0.00001);
	      
	   }
		@Test
	public void testDiv() {
		  int a= 8, b= 0;
	      double expected = -3.0;
	  	double result=Calcmodel.div(a,b);
		  assertEquals(expected,result,0.00001);
	      
	   }
		@Test
	public void testsub() {
		double a= 4.0, b= -5.0;
	      double expected = 9.0;
		double result= Calcmodel.sub(a,b);
		assertEquals(expected,result,0.00001);
	      
	   }
		@Test
		public void testmod() {
			double a= -2.6, b= 2.0;
		      double expected = -4;
			double result= Calcmodel.mod(a,b);
			assertEquals(expected,result,0.00001);
		      
		   }
		@Test
		public void testmod2() {
			double a= -2.6, b= 0;
		      double expected = -3;
			double result= Calcmodel.mod(a,b);
			assertEquals(expected,result,0.00001);
		      
		   }
         @Test
		public void testsqr() {
			double a= -3.0;
		      double expected = -2;
		  	double result = Calcmodel.sqr(a);
			assertEquals(expected,result,0.00001);
		      
		   }

	}

