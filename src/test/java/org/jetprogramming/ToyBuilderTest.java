package org.jetprogramming;

import org.jetprogramming.interfacesegregation.good.ToyBuilder;
import org.jetprogramming.interfacesegregation.good.ToyCar;
import org.jetprogramming.interfacesegregation.good.ToyHouse;
import org.jetprogramming.interfacesegregation.good.ToyPlane;
import org.junit.Test;

public class ToyBuilderTest {

	@Test
	public void testBuildToyHouse() throws Exception {
		ToyHouse toyHouse = ToyBuilder.buildToyHouse();
		System.out.println(toyHouse);
	}

	@Test
	public void testBuildToyCar() throws Exception {
		ToyCar toyCar = ToyBuilder.buildToyCar();
		;
		System.out.println(toyCar);
	}

	@Test
	public void testBuildToyPlane() throws Exception {
		ToyPlane toyPlane = ToyBuilder.buildToyPlane();
		System.out.println(toyPlane);
	}
}