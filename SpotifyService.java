public class User {
    private String name;
    private String mobileNumber;
    private List<Song> likedSongs = new ArrayList<>();
    private List<Playlist> playlists = new ArrayList<>();

    public User(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getName() { return name; }
    public String getMobileNumber() { return mobileNumber; }
    public List<Song> getLikedSongs() { return likedSongs; }
    public List<Playlist> getPlaylists() { return playlists; }
}
