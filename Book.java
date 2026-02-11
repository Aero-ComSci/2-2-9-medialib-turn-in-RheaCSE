public class Book {
    private String title;
    private String author;
    private int rating;

    public Book() {
        title = "";
        author = "";
        rating = 0;
    }

    public Book(String t, String a, int r) {
        title = t;
        author = a;
        rating = r;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setRating(int r) {
        if (r < 0) r = 0;
        if (r > 10) r = 10;
        rating = r;
    }

    public int getRating() {
        return rating;
    }

    public void adjustRating(int change) {
        int newRate = rating + change;
        if (newRate < 0) {
            newRate = 0;
        }
        if (newRate > 10) {
            newRate = 10;
        }
        rating = newRate;
    }

    public boolean equals(Book other) {
        if (other == null) return false;
        return title.equals(other.title);
    }

    public static boolean testBook(Book tester) {
        return tester.rating > 7;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + rating +  " rating)";
    }
}