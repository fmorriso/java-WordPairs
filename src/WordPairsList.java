import java.util.ArrayList;

public class WordPairsList
{
    private ArrayList<WordPair> allPairs;

    public WordPairsList(String[] words)
    {
        // WRITE YOUR CODE HERE
        // initialize allPairs to an empty ArrayList of WordPair objects
        allPairs = new ArrayList<WordPair>();

        // nested loops through the words array to add each pair to allPairs
        String current, next;
        for (int i = 0; i < words.length; i++) {
            current = words[i];
            for (int j = i + 1; j < words.length; j++) {
                next = words[j];
                this.allPairs.add(new WordPair(current, next));
            }
        }

    }

    public int numMatches()
    {
        // Write the code for the second part described below
        int n = 0;
        for (WordPair wp : this.allPairs)
            if (wp.getFirst().equals(wp.getSecond())) n++;
        return n;
    }

    public String toString()
    {
        return allPairs.toString();
    }
}
