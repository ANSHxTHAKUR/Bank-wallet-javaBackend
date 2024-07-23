package com.hm.wallet.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class DemoServiceTest {
	
	@Test
	@Order(1)
	void test1() {
		System.out.println("test 1");
	}
	@Test
	@Order(2)
	void test2() {
		System.out.println("test 2");
	}
	private Calculator calculator = new Calculator();
//	
//	@Test
//	public void testAddForPositiveNumbers() {
//		
//		assertEquals(4, calculator.add(2, 2)); // +ve
//		
//	}
//	
//	@Test
//	public void testAddForNegativeNumbers() {
//		
//		assertEquals(0, calculator.add(2, -2)); // +ve
//		
//	}
//	
//	@Test
//	public void testDemo() {
//		
//		assertEquals(4.0, calculator.mul(2.0, 2.0)); // +ve
//		assertTrue(calculator != null);
//		assertFalse(calculator == null);
//		assertThrows(ArithmeticException.class, ()->calculator.div(1, 0));
//		//assertDoesNotThrow(()->calculator.div(1, 0));
//		//assertNull(calculator);
//		assertNotNull(calculator);
//		assertTimeout(Duration.ofMillis(1), ()->calculator.div(1, 1), "Method should execute in 1000 ms");
//		//Float [] floatData = new Float[4];
//		Float [] floatArrayFirst = {12.0f,13.0f,14.0f};
//		Float [] floatArraySecond = {11.0f,13.0f,14.0f};
//		
//		assertArrayEquals(floatArrayFirst, floatArraySecond);
//		
//		
//		
//	}
	
	@BeforeAll
    static void initAll() {
		System.out.println("Before All");
    }

    @BeforeEach
    void init() {
    	System.out.println("Before Each");
    }

    @Test
    void succeedingTest() {
    	System.out.println("Some test 1");
    }
    @Test
    void succeedingTest2() {
    	System.out.println("Some test 2");
    }

    @Test
    void failingTest() {
    	System.out.println("Failing test");
        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @Test
    void abortedTest() {
    	System.out.println("Aborted test using fail");
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @AfterEach
    void tearDown() {
    	System.out.println("After each");
    }

    @AfterAll
    static void tearDownAll() {
    	System.out.println("After All");
    }
	
	
//	
//	@Test
//	public void demoTest() {
//		assertEquals(null, null);
//		assertNotEquals(null, null);
//		
//		assertTrue(false);
//		assertFalse(false);
//		
//		assertThrows(null, null);
//		assertDoesNotThrow(null);
//		
//		assertNull(calculator);
//		assertNotNull(calculator);
//		
//		assertNotSame(calculator, calculator);
//		assertSame(calculator, calculator);
//		
//		assertTimeout(null, null);
//		assertArrayEquals(null, null);
//		fail(null);
//		
//	}
//	
//	
	
	
}
