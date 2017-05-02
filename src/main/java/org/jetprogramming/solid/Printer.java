package org.jetprogramming.solid;

public class Printer {
	private Text text;

	public Printer(Text text) {
		super();
		this.text = text;
	}

	public void printText() {
		System.out.println(text);
	}

}
