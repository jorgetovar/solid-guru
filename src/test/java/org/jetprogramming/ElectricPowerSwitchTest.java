package org.jetprogramming;

import org.jetprogramming.dependencyinversion.good.ElectricPowerSwitch;
import org.jetprogramming.dependencyinversion.good.Fan;
import org.jetprogramming.dependencyinversion.good.LightBulb;
import org.jetprogramming.dependencyinversion.good.Switch;
import org.jetprogramming.dependencyinversion.good.Switchable;
import org.junit.Test;

public class ElectricPowerSwitchTest {

	@Test
	public void testPress() throws Exception {
		Switchable switchableBulb = new LightBulb();
		Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
		bulbPowerSwitch.press();
		bulbPowerSwitch.press();

		Switchable switchableFan = new Fan();
		Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
		fanPowerSwitch.press();
		fanPowerSwitch.press();
	}
}