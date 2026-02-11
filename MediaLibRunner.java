/*
 * Activity 2.2.7
 * 
 * The runner for the MediaLib program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    System.out.println(MediaLib.getOwner());
    System.out.println(MediaLib.searchBook("The Great Gatsby"));

    Book myBook = new Book("To Kill a Mockingbird", "Yashvitha Tanguturi", 0);
    System.out.println(myBook);
    myBook.setRating(5);
    System.out.println("The book rating is " + myBook.getRating());
    myBook.adjustRating(7);
    System.out.println("After adjustment, rating is " + myBook.getRating());
    myLib.addBook(myBook);
    MediaLib.incrementBookCount();
    System.out.println(myLib);
    System.out.println("Total books: " + MediaLib.getBookCount());
    System.out.println(myBook.toString());
    System.out.println("Total books: " + MediaLib.getNumBooks());
    System.out.println("");
    System.out.println("");
    

    Movie myMovie = new Movie("Interstellar", 2.5);
    System.out.println(myMovie);
    myMovie.setRating(9);
    System.out.println("The movie rating is " + myMovie.getRating());
    myMovie.adjustRating(-2);
    System.out.println("After adjustment, rating is " + myMovie.getRating());
    myLib.addMovie(myMovie);
    Movie.incrementMovieCount();
    System.out.println(myLib);
    System.out.println(myMovie.toString());
    System.out.println("Total Movies: " + MediaLib.getNumMovies());
    System.out.println("");
    System.out.println("");


    Song mySong = new Song("Bohemian Rhapsody", "Queen", 354);
    System.out.println(mySong);
    mySong.setRating(10);
    System.out.println("The song rating is " + mySong.getRating());
    mySong.adjustRating(-3);
    System.out.println("After adjustment, rating is " + mySong.getRating());
    myLib.addSong(mySong);
    System.out.println(MediaLib.getOwner() + "'s Library");
    mySong.setDuration(360);
    System.out.println("The song duration is " + mySong.getDuration() + " seconds");
    System.out.println(myLib);
    System.out.println(mySong.toString());
    System.out.println("Total Songs: " + MediaLib.getNumSongs());
    System.out.println("");
    System.out.println("");
    System.out.println("Total Entries:" + MediaLib.getNumEntries());
  }
}