package com.sample.test;

public interface Calculator {
	
	Number calculate(Operation op, Number num1, Number num2);

	Calculator chain(Operation op, Number num);

	Number getResult();
}