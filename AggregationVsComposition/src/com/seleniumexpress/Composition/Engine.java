package com.seleniumexpress.Composition;

public class Engine {

	private String engineType;

	public Engine(String engineType) {

		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + "]";
	}

}
