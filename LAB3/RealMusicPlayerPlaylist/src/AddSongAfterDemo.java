public class AddSongAfterDemo {

    public static void main(String[] args) {

        MusicPlaylist playlist = new MusicPlaylist();

        playlist.addSong("Song A");
        playlist.addSong("Song C");
        playlist.addSong("Song D");

        System.out.println("Before:");
        playlist.displayPlaylist();

        playlist.addSongAfter("Song A", "Song B");

        System.out.println("After:");
        playlist.displayPlaylist();

        playlist.addSongAfter("Song D", "Song E");

        System.out.println("After Tail Insertion:");
        playlist.displayPlaylist();

        playlist.addSongAfter("Unknown", "Song F");
    }
}