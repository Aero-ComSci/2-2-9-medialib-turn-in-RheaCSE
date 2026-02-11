public class Song {
    private String title;
    private String artist;
    private int duration; 
    private int rating;// duration in seconds

    public Song() {
        title = "";
        artist = "";
        duration = 0;
        rating = 0;
    }

    public Song(String t, String a, int d) {
        title = t;
        artist = a;
        duration = d;
        rating = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String a) {
        artist = a;
    }

    public void setDuration(int d) {
        if (d < 0) d = 0;
        duration = d;
    }

    public int getDuration() {
        return duration;
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

    public boolean equals(Song other) {
        if (other == null) return false;
        return title.equals(other.title);
    }

    public static boolean testSong(Song tester) {
        return tester.getRating() > 7;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + duration + " seconds)";
    }

}