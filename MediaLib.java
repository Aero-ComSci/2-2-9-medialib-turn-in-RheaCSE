public class MediaLib {
    private static int bookCount = 0;
    private static int numEntries = 0;
    private static int movieCount = 0;
    private static int songCount = 0;
    private Book book;
    private Movie movie;
    private static String owner = "PLTW";
    private Song song;
    public MediaLib() { }

    public void addSong(Song s){
        if (s == null) {
            System.out.println("Cannot add null song");
            return;
        }
        this.song = s;
        System.out.println("Song added: " + s.getTitle());
            incrementSongCount();
            addnumEntries();
    }
    
    public void addMovie(Movie m) {
        if (m == null) {
            System.out.println("Cannot add null movie");
            return;
        }
        this.movie = m;
        System.out.println("Movie added: " + m.getTitle());
        incrementMovieCount();
        addnumEntries();
    }
    public static String getOwner() {
        return owner;
    }

    public static void changeOwner(String n){
        if (n != null && !n.isEmpty()) {
            owner = n;
        } else {
            System.out.println("Owner name cannot be null or empty");
        }
    }

    public static int getNumEntries() {
        return numEntries;
    }

    public static void setNumEntries(int num) {
        if (num >= 0) {
            numEntries = num;
        } else {
            System.out.println("Number of entries cannot be negative");
        }
    }

    public void addBook(Book b) {
        if (b == null) {
            System.out.println("Cannot add null book");
            return;
        }
        this.book = b;
        System.out.println("Book added: " + b.getTitle());
        incrementBookCount();
        addnumEntries();
    }

    public static String searchBook(String title) {
        if ("To Kill a Mockingbird".equals(title)) {
            return "Book found: To Kill a Mockingbird by Lee";
        }
        return title + " not found";
    }

    // called from Book constructor

    public static void addnumEntries(){
        numEntries++;
    }
    public static void incrementBookCount() {
        bookCount++;
    }

    public static void incrementMovieCount(){
        movieCount++;
    }

    public static void incrementSongCount(){
        songCount++;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public static String getLibraryState() {
        return "Library has " + bookCount + " book(s)";
    }

    @Override
    public String toString() {
        return getLibraryState();
    }

    public static int getNumBooks() {
       return bookCount;
    }
    public static int getNumMovies() {
        return movieCount;
    }

    public static int getNumSongs() {
        return songCount;
    }    
}