package org.jetprogramming.liskovsubs.good;

public abstract class DevWithEngine extends TransportationDevice {
	
	Engine engine;
	
	public abstract void startEngine();

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
