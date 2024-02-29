public class WordPair
{
    private String word1;
    private String word2;

    public WordPair(String word1, String word2)
    {
        this.word1 = word1;
        this.word2 = word2;
    }

    public String getFirst()
    {
        return word1;
    }

    public String getSecond()
    {
        return word2;
    }

    public String toString()
    {
        return "(" + word1 + ", " + word2 + ")";
    }
}

