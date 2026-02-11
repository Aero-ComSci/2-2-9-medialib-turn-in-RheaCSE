/*
 * Movie class for MediaLibrary
 */

public class Movie
{
    private String title;
    private double duration;
    private int rating;
    private static int movieCount = 0;

    public Movie(String t, double d)
    {
        title = t;
        duration = d;
        rating = 0;
    }

    public String getTitle() { return title; }
    public double getDuration() { return duration; }
    public int getRating() { return rating; }

    public void setTitle(String t) { title = t; }
    public void setDuration(double d) { duration = d; }
    public void setRating(int r) { rating = r; }

    public int adjustRating(int change)
    {
        int newRating = rating + change;
        if(newRating >= 0 && newRating <= 10)
        {
            rating = newRating;
        }
        return rating;
    }

    public boolean equals(Movie m)
    {
        if(m == null)
        {
            return false;
        }

        return this.title.equals(m.title) &&
               this.duration == m.duration;
    }

    public static void incrementMovieCount() {
        movieCount++;
    }

    @Override
    public String toString()
    {
        String info = "\"" + title + "\" (" + duration + " hrs)";
        if(rating != 0)
        {
            info += ", rating " + rating;
        }
        return info;
    }
}