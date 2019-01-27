package main.java;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.*;
public class TestCases {
	
@Test
public void test1()
{
	System.out.println("Test 1 is passed ");
}

@Test
public void test2()
{
	System.out.println("Test 2 is passed ");
}

@Test
public void test3()

{
	System.out.println("Test 3 initiated");
Assert.assertEquals(0, 1);
}
}
