package edu.esprit.greeter;

public class Greeter {

	public String var1;

	public String var2;

	/**
	 * sayHello method
	 * @param name
	 * @return "Hello" + name
	 */
public String sayHello(String name)
{
	if(name.equals("MAN"))
			throw new IllegalArgumentException();
			return "Hello "+name;
	}
}
