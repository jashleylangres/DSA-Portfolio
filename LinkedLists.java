 import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> animeList = new LinkedList<>();

        // Add favorite anime titles to the list
        animeList.add("Spy x Family");
        animeList.add("My Dress Up Darling");
        animeList.add("One Piece");
        animeList.add("Servamp");
        animeList.add("Chainsaw Man");
        animeList.add("Demon Slayer");
        animeList.add("Sword Art Online");

        // Print the list of favorite anime
        System.out.println("List of My Favorite Anime:");
        for (String anime : animeList) {
            System.out.println(anime);
        }
    }
}
