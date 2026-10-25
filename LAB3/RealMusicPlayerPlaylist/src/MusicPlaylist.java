public class MusicPlaylist {

    private SongNode head;
    private SongNode tail;
    private SongNode current;

    // Constructor
    public MusicPlaylist() {
        head = null;
        tail = null;
        current = null;
    }

    // Add a song at the end
    public void addSong(String title) {

        SongNode newNode = new SongNode(title);

        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    // Remove a song by title
    public void removeSong(String title) {

        SongNode temp = head;

        while (temp != null &&
               !temp.title.equals(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println(
                "The song isn't in the playlist"
            );
            return;
        }

        // Update current if removing selected song
        if (temp == current) {
            if (temp.next != null) {
                current = temp.next;
            }
            else {
                current = temp.prev;
            }
        }

        // Update the previous node or head
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        else {
            head = temp.next;
        }

        // Update the next node or tail
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        else {
            tail = temp.prev;
        }

        temp.next = null;
        temp.prev = null;

        System.out.println("Removed: " + title);
    }

    // Move forward
    public void nextSong() {

        if (current == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        if (current.next != null) {
            current = current.next;
            System.out.println(
                "Playing: " + current.title
            );
        }
        else {
            System.out.println(
                "Already at the last song of the playlist."
            );
        }
    }

    // Move backward
    public void previousSong() {

        if (current == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        if (current.prev != null) {
            current = current.prev;
            System.out.println(
                "Playing: " + current.title
            );
        }
        else {
            System.out.println(
                "Already at the first song of the playlist."
            );
        }
    }

    // Display currently selected song
    public void displayCurrentSong() {

        if (current == null) {
            System.out.println("No song is playing.");
            return;
        }

        System.out.println(
            "Current Song: " + current.title
        );
    }

    // Display all songs
    public void displayPlaylist() {

        SongNode temp = head;

        while (temp != null) {
            System.out.print(
                temp.title + " <-> "
            );

            temp = temp.next;
        }

        System.out.println("END");
    }

    // Additional Exercise: Insert after a song
    public void addSongAfter(
        String existingTitle,
        String newTitle
    ) {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        SongNode search = head;

        while (search != null &&
               !search.title.equals(existingTitle)) {
            search = search.next;
        }

        if (search == null) {
            System.out.println(
                "Song not found: " + existingTitle
            );
            return;
        }

        SongNode newNode = new SongNode(newTitle);

        newNode.prev = search;
        newNode.next = search.next;

        if (search.next != null) {
            search.next.prev = newNode;
        }
        else {
            tail = newNode;
        }

        search.next = newNode;
    }
}