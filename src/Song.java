
public class Song{

    private String song;
    private String artist;
    private String duration;

    public Song(String song, String artist, String duration) {
        this.song = song;
        this.artist = artist;
        this.duration = duration;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

   
}
