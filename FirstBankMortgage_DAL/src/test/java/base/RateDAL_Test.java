package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class RateDAL_Test {

	private double intrstRate = 0;
	
	@Test
	public void testGetRates() {
		assertTrue(RateDAL.getRate().size() > 0);
	}
	
	@Test 
	public void test600(){
		intrstRate = RateDAL.getRate(600);
		assertTrue(intrstRate == 5);
	}
	
	@Test 
	public void test625(){
		intrstRate = RateDAL.getRate(625);
		assertTrue(intrstRate == 5);
	}	

	@Test 
	public void test650(){
		intrstRate = RateDAL.getRate(650);
		assertTrue(intrstRate == 4.5);
	}
	
	@Test  
	public void test675(){
		intrstRate = RateDAL.getRate(675);
		assertTrue(intrstRate == 4.5);
	}
	
	@Test 
	public void test700(){
		intrstRate = RateDAL.getRate(700);
		assertTrue(intrstRate == 4);
	}
	
	@Test
	public void test725(){
		intrstRate = RateDAL.getRate(725);
		assertTrue(intrstRate == 4);
	}

	public void test750(){
		intrstRate = RateDAL.getRate(750);
		assertTrue(intrstRate == 3.75);
	}
	
	
	@Test
	public void test755(){
		intrstRate = RateDAL.getRate(755);
		assertTrue(intrstRate == 3.75);
	}	

	@Test
	public void test800(){
		intrstRate = RateDAL.getRate(800);
		assertTrue(intrstRate == 3.5);
	}
	

}
