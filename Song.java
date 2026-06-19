class Song {

    private String title;
    private String artist;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public static void main(String[] args) {

        Song s = new Song();

        s.setTitle("Believer");
        s.setArtist("Imagine Dragons");

        s.setTitle("Shape of You");

        System.out.println("Title: " + s.getTitle());
        System.out.println("Artist: " + s.getArtist());
    }
}
