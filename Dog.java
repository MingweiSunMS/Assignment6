import java.util.Calendar;

public class Dog extends Pet implements Boardable  {
	
	private String size;
	private Calendar start, end;
	
	public Dog(String name, String ownerName, String color, String size) {
		super(name,ownerName,color);
		this.size=size;
	}
	
	public String getSize() {
		return this.size;
	}
	
	@Override
	public String toString() {
		return "DOG: \n"+this.getPetName()+" is owned by "+this.getOwnerName()+"\nColor: "+this.getColor()+"\nSex: "+this.getSex()+"\nSize: "+this.getSize();
	}
	
	@Override
	public void setBoardStart(int month, int day, int year) {
		// TODO Auto-generated method stub
		this.start=Calendar.getInstance();
		this.start.set(year, month, day);
		
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		// TODO Auto-generated method stub
		this.end=Calendar.getInstance();
		this.end.set(year, month, day);
		
	}

	@Override
	public boolean boardingt(int month, int day, int year) {
		// TODO Auto-generated method stub
		Calendar compare=Calendar.getInstance();
		compare.set(year, month, day);
		if(compare.compareTo(this.start)>=0&&compare.compareTo(this.end)<=0) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		Dog dog=new Dog("TOM","SAM","white","medium");
		System.out.println(dog.toString());
		dog.setSex(2);
		System.out.println(dog.toString());
		dog.setBoardStart(5, 30, 2016);
		dog.setBoardEnd(6, 28, 2019);
		System.out.println(dog.boardingt(4, 4, 2017));
		System.out.println(dog.boardingt(4, 4, 2020));

		
	}

}
