package com.sandeep.samplegit;

public class Calculator {

	double number1;
	double number2;
	double sum;
	double difference;
	
	public double addNumber()
	{
		this.sum =this.number1+this.number2;
		return this.sum;
	}
	
	public double subtractNumber()
	{
		this.difference =this.number1-this.number2;
		return this.difference;
	}

	public Calculator() {
		this.number1 = 0;
		this.number2 = 0;
	}
}
