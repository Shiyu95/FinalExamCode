package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RateDAL_Test {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void Test(){
		double Ratetest1 = RateDAL.getRate(600);
		assertTrue(Ratetest1 == 3.75);
		
		double Ratetest2 = RateDAL.getRate(710);
		assertTrue(Ratetest2 == 4.75);
		
		double Ratetest3 = RateDAL.getRate(750);
		assertTrue(Ratetest3 == 3.75);
		
		double Ratetest4 = RateDAL.getRate(800);
		assertTrue(Ratetest4 == 3.45);
		
	}
}

