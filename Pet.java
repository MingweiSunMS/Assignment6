
public class Pet {
	private String petName;
	private String ownerName;
	private String color;
	protected int sex;
	
	static final int MALE=1;
	static final int FEMALE=2;
	static final int SPAYED=3;
	static final int NEUTERED=4;
	
	public Pet(String name, String ownerName, String color) {
		this.petName=name;
		this.ownerName=ownerName;
		this.color=color;
	}
	
	public String getPetName() {
		return this.petName;
	}
	
	public String getOwnerName() {
		return this.ownerName;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setSex(int sexid) {
		this.sex=sexid;
	}
	
	public String getSex() {
		if(this.sex==MALE) {
			return "MALE";
		}else if(this.sex==FEMALE) {
			return "FEMALE";
		}else if(this.sex==SPAYED) {
			return "SPAYED";
		}else if(this.sex==NEUTERED){
			return "NEUTERED";
		}
		
		return "Not defined";
	}
	
	public String toString() {
		return this.petName+" is owned by "+this.ownerName+"\nColor: "+this.color+"\nSex:"+this.getSex();
	}
	
	public static void main(String args[]) {
		Pet pet1=new Pet("TOM","JAM","RED");
		System.out.println(pet1.toString());
		pet1.setSex(1);
		System.out.println(pet1.toString());
	}
}
