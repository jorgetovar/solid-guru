package org.jetprogramming.liskovsubs.err;

public abstract class TransportationDevice {

	Engine engine;
	String color;

	public abstract void startEngine();

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
