import java.util.*;

public class Mreview implements Comparable<Mreview> {

	private String title;
	private ArrayList<Integer> ratings;
	
	public Mreview() {
		this.ratings=new ArrayList<>();
	}
	
	public Mreview(String title) {
		this.title=title;
		this.ratings=new ArrayList<>();
	}
	
	public Mreview(String title, int rating) {
		this.title=title;
		this.ratings=new ArrayList<>();
		this.ratings.add(rating);
	}
	
	public void addRating(int rating)
	{
		this.ratings.add(rating);
	}
	
	public double aveRating() {
		
		if(this.ratings.size()==0) {
			return 0;
		}
		
		double sum=0;
		for(int i:this.ratings) {
			sum+=i;
		}
		return sum/(this.ratings.size());
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int numRatings() {
		return this.ratings.size();
	}
	
	public String toString() {
		return this.title+", average "+this.aveRating()+" out of "+this.numRatings()+" ratings";
	}
	
	public boolean equals(Mreview m) {
		return this.getTitle().equals(m.title);
	}
	
	@Override
	public int compareTo(Mreview o) {
		return title.compareTo(o.title);
	}

}
