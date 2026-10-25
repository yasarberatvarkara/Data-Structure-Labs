/**
 * SongNode.java
 *
 * Represents a song of a playlist.
 *
 * Your Name:        Yasar Berat Varkara
 * Your Student ID:  230446011
 * Your Date:        23.10.2026
 */
public class SongNode {

    String title;
    SongNode prev;
    SongNode next;

    public SongNode(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}