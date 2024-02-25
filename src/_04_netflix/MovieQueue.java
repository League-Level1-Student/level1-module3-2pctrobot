package _04_netflix;

public class MovieQueue {
public static void main(String[] args) {
	Movie movie1 = new Movie("Wish", 1);
	System.out.println(movie1.toString());
	System.out.println(movie1.getTicketPrice());
	Movie movie2 = new Movie("Star Wars Christmas Special", 2);
	System.out.println(movie2.toString());
	System.out.println(movie2.getTicketPrice());
	Movie movie3 = new Movie("The Lego Movie 2", 3);
	System.out.println(movie3.toString());
	System.out.println(movie3.getTicketPrice());
	Movie movie4 = new Movie("The Martian", 4);
	System.out.println(movie4.toString());
	System.out.println(movie4.getTicketPrice());
	Movie movie5 = new Movie("Terminator 2", 5);
	System.out.println(movie5.toString());
	System.out.println(movie5.getTicketPrice());
	NetflixQueue queue = new NetflixQueue();
	queue.addMovie(movie1);
	queue.addMovie(movie2);
	queue.addMovie(movie3);
	queue.addMovie(movie4);
	queue.addMovie(movie5);
	queue.printMovies();
	System.out.println("The best movie is " + queue.getBestMovie() + ".");
	queue.sortMoviesByRating();
	System.out.println("The second best movie is " + queue.getMovie(1) + ".");
}
}
