package com.seleniumexpress.Composition;

public class Car {

	private String carName;
	private Integer modelNumber;
	private Engine engine;

	public Car(String carName, Integer modelNumber, String engineType) {

		this.carName = carName;
		this.modelNumber = modelNumber;
		this.engine = new Engine(engineType);
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", modelNumber=" + modelNumber + ", engine=" + engine + "]";
	}

}
