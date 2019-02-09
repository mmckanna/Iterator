
public class ArmoryItem {
	
	String modelType;
	String weaponType;
	String mission;
	String armorType;
 
	public ArmoryItem(String modelType, 
	                String weaponType, 
	                String mission,
	                String armorType) 
	{
		this.modelType = modelType;
		this.weaponType = weaponType;
		this.mission = mission;
		this.armorType = armorType;
	}
  
	public String getModelType() {
		return modelType;
	}
  
	public String getWeaponType() {
		return weaponType;
	}
  
	public String getMission() {
		return mission;
	}
  
	public String getArmorType() {
		return armorType;
	}

}
