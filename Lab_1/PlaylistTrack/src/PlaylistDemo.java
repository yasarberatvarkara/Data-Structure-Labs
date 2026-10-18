public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // Default constructor
        Track defaultTrack = new Track();

        System.out.println("Default Track:");
        System.out.println(defaultTrack);
        System.out.println();

        // Title-only constructor
        Track titleTrack = new Track("Neon Lights");

        System.out.println("Title-only track:");
        System.out.println(titleTrack);
        System.out.println();

        // Title + artist constructor
        Track artistTrack = new Track(
            "Ocean Drive", "Midnight Pulse"
        );

        System.out.println("Title + Artist Track:");
        System.out.println(artistTrack);
        System.out.println();

        // Full constructor
        Track fullTrack = new Track(
            "Raindrop Waltz", "Clara Voss", 210, false
        );

        System.out.println("Full Track (non-explicit):");
        System.out.println(fullTrack);
        System.out.println();

        // Invalid duration
        System.out.println("Invalid Duration Test:");

        Track invalidTrack = new Track(
            "Broken Clock", "Static Noise", -10, false
        );

        System.out.println(invalidTrack);
        System.out.println();

        // Getter tests
        Track getterTrack = new Track(
            "Stardust", "Stellar Echo", 242, true
        );

        System.out.println("Getter Test:");

        System.out.println("Title:     " + getterTrack.getTitle());
        System.out.println("Artist:    " + getterTrack.getArtist());
        System.out.println("Duration:  "
                + getterTrack.getDurationFormatted());
        System.out.println("Explicit:  "
                + getterTrack.getIsExplicit());

        // Explicit toString test
        System.out.println(getterTrack);
    }
}