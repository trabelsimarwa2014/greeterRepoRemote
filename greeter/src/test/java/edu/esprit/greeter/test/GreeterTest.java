package edu.esprit.greeter.test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.esprit.greeter.Greeter;

//le nom de la classe doit contenir le mot test

public class GreeterTest 
{
	Greeter greeter;
	@Before
	public void setup()
	{
		greeter=new Greeter();
	}
	@Test

	public void itShouldSayHello()
	{

		String result = greeter.sayHello("world");
		// System.out.println(result); impossible dans le cas d'un grand projet
		Assert.assertEquals("Hello world", result);


	}
	// on s'attend à ce qui cette méthode lève une exception
	
	@Test (expected = IllegalArgumentException.class)
	public void itShouldRaiseException()
	{
		String param="MAN";
		greeter.sayHello(param);
	}
	
	//Une fois le test terminé, on a plus besoin de la var greeter
	@After
	public void tearDown()
	{
		greeter=null;
	}



}
