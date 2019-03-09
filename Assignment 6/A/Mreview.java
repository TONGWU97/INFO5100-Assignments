package homework06;

import java.util.ArrayList;

public class Mreview {
	private String title;
	private ArrayList<Integer> ratings;

	public static void main(String[] args) {
		Mreview movie = new Mreview("Kill Bill");
		movie.addRating(3);
		movie.addRating(4);
		movie.addRating(3);
		System.out.println(movie.toString() + "\nThe average rating is " + movie.aveRating());
	}

	// Constructors
	public Mreview() {
		this.title = "";
		this.ratings = new ArrayList<Integer>();
	}

	public Mreview(String ttl) {
		this.title = ttl;
		this.ratings = new ArrayList<Integer>();
	}

	public Mreview(String ttl, int firstRating) {
		this.title = ttl;
		this.ratings = new ArrayList<Integer>();
		this.ratings.add(firstRating);
	}

	// Methods
	public void addRating(int r) {
		this.ratings.add(r);
	}

	public double aveRating() {
		int sum = 0;
		for (int r : this.ratings) {
			sum += r;
		}
		double ave = sum / this.ratings.size();
		return ave;
	}

	public int compareTo(Mreview obj) {
		if (this.title.equals(obj.title))
			return 0;
		else
			return this.title.compareTo(obj.title);
	}

	public boolean equals(Object obj) {
		return this.title.equals(((Mreview) obj).title);
	}

	public String getTitle() {
		return this.title;
	}

	public int numRatings() {
		return this.ratings.size();
	}

	public String toString() {
		return this.title + ", average " + this.aveRating() + " out of " + this.numRatings() + " ratings";
	}
}
