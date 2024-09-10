package com.tcet;
@FunctionalInterface
interface Sayable{
	String say(String message);
}

public class qn1 {
	public static void main (String[] args) {
		Sayable sayable=(message)->"Hello, "+message+ "!";
		String greeting=sayable.say("World");
		System.out.println(greeting);
	}

}
