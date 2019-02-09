import java.util.*;

public class DeployStormtrooper {
	
	ArrayList<Armory> armory;
    
	  
	public DeployStormtrooper(ArrayList<Armory> armory) {
		this.armory = armory;
	}
   
	public void printMenu() {
		Iterator<?> armoryIterator = armory.iterator();
		while(armoryIterator.hasNext()) {
			Armory armory = (Armory)armoryIterator.next();
			printMenu(armory.createIterator());
		}
	}
   
	void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			ArmoryItem armoryItem = (ArmoryItem)iterator.next();
			System.out.print("--- " + armoryItem.getModelType() + " --- ");
			System.out.print("\n");
			System.out.print("Weapon:" + armoryItem.getWeaponType() + "\n");
			System.out.println("Armor: " + armoryItem.getArmorType());
			System.out.println("Mision: " + armoryItem.getMission() + "\n");
						
		}
	}
}  

