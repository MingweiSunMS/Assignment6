import java.util.Calendar;
import java.util.Date;

public class Cat extends Pet implements Boardable {

	private String hairLength;
	private Calendar start,end;
	
	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength=hairLength;
	}
	
	public String getHairLength() {
		return this.hairLength;
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
	
	@Override
	public String toString() {
		return "CAT: \n"+this.getPetName()+" is owned by "+this.getOwnerName()+"\nColor: "+this.getColor()+"\nSex: "+this.getSex()+"\nHair: "+this.getHairLength();
	}
	
	public static void main(String args[]) {
		Cat cat=new Cat("TOM","SAM","white","short");
		System.out.println(cat.toString());
		cat.setSex(3);
		System.out.println(cat.toString());
		cat.setBoardStart(5, 30, 2016);
		cat.setBoardEnd(6, 28, 2019);
		System.out.println(cat.boardingt(4, 4, 2017));
		System.out.println(cat.boardingt(4, 4, 2020));

		
	}
	
}
