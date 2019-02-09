import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestCases {

	@Test
	void test() {
		
		StormtrooperArmory stormtrooperArmory = new StormtrooperArmory();
		ArrayList<Armory> armory = new ArrayList<Armory>();
		
		armory.add(stormtrooperArmory);
		DeployStormtrooper deployStormtrooper = new DeployStormtrooper(armory);
		deployStormtrooper.printMenu();
		
		
	}
	
}
