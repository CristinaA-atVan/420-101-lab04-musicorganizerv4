/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    // How many times the track has been played.
    private int playCount;
    // Is the track a favorite?
    private boolean favorite;
    
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename)
    {
        setDetails(artist, title, filename);
        playCount = 0;
        favorite = false;
    }
    
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        setDetails("unknown", "unknown", filename);
        playCount = 0;
        favorite = false;
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }
        
    /**
     * Return details of the track: artist, title and file name.
     * @return The track's details.
     */
    public String getDetails()
    {
        return artist + ": " + title + " (file: " + filename + ")";
    }
    
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title, String filename)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
    }
    
    /**
     * Reset the play count of the track.
     * Answer to Question 29
     */
    public int resetPlayCount()
    {
        playCount = 0;
        return playCount;
    }
    
    /**
     * Increase the play count of the track by 1.
     * Answer to Question 29
     */
    public int increasePlayCount()
    {
        playCount++;
        return playCount;
    }
    
    /**
     * See if a track is a favorite.
     * Answer to Question 31
     */
    public boolean isFavorite(String filename)
    {
        return favorite;
    }
    
    /**
     * Make a track a favorite.
     * Answer to Question 31
     */
    public void setFavorite(int index)
    {
        if(favorite == false) {
            favorite = true;
            System.out.println("Set " + filename + " as a favorite!");
        }
        else {
            System.out.println(filename + " is already a favorite!");
        }
    }
    
    /**
     * Remove a track from favorites.
     * Answer to Question 31
     */
    public void unfavorite(int index)
    {
        if(favorite == true) {
            favorite = false;
            System.out.println(filename + " is no longer a favorite!");
        }
        else {
            System.out.println(filename + " is already not a favorite!");
        }
    }
}
