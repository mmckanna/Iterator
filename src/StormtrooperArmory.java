import java.util.Iterator;

public class StormtrooperArmory implements Armory {
	
	static final int MAX_ITEMS = 50;
	int numberOfItems = 0;
	ArmoryItem[] armoryItems;
  
	public StormtrooperArmory() {
		armoryItems = new ArmoryItem[MAX_ITEMS];
 
		addItem("Deathtrooper", "Classified", "Classified", "Shiny Black");
		addItem("Stormtrooper", "E-11 blaster rifle", "War", "White");
		addItem("Shadow trooper", "Classified", "Classified", "Matte Black");
		addItem("Scout trooper", "EC-17 blaster", "Battle of Endor", "Lightweight white");
		addItem("Wet-weather gear stormtrooper", "E-11 blaster rifle", "Mimban campaign", "Waterproof white");
	}
  
	public void addItem(String modelType, String weaponType, String mission, String armorType) 
	{
		ArmoryItem armoryItem  = new ArmoryItem(modelType, weaponType, mission, armorType);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			armoryItems[numberOfItems] = armoryItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public ArmoryItem[] getArmoryItems() {
		return armoryItems;
	}
  
	public Iterator<ArmoryItem> createIterator() {
		return new ArmoryIterator(armoryItems);
	}
}

