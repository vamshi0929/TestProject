package com.sample.test;

public class SimpleCalculator implements Calculator {
	
	private Number result;

	public SimpleCalculator(Number initialValue) {
		this.result = initialValue;
	}

	@Override
	public Number calculate(Operation op, Number num1, Number num2) {
		switch (op) {
		case ADD:
			return num1.doubleValue() + num2.doubleValue();
		case SUBTRACT:
			return num1.doubleValue() - num2.doubleValue();
		case MULTIPLY:
			return num1.doubleValue() * num2.doubleValue();
		case DIVIDE:
			if (num2.doubleValue() == 0) {
				throw new IllegalArgumentException("Division by zero is not allowed.");
			}
			return num1.doubleValue() / num2.doubleValue();
		default:
			throw new UnsupportedOperationException("Operation not supported.");
		}
	}

	@Override
	public Calculator chain(Operation op, Number num) {
		this.result = calculate(op, this.result, num);
		return this;
	}

	@Override
	public Number getResult() {
		return this.result;
	}
}
