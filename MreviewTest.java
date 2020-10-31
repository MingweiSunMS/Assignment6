import java.util.ArrayList;

public class MreviewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mreview m1=new Mreview();
		Mreview m2=new Mreview("TestMreview");
		m2.addRating(3);
		m2.addRating(4);
		m2.addRating(3);
		
		Mreview m3=new Mreview("TestMreview",9);
		m3.addRating(9);
		m3.addRating(9);
		System.out.println(m2.toString());
		System.out.println(m2.equals(m3));
		System.out.println(m2.compareTo(m3));
	}

}
