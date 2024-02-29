import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        System.out.format("WordPairs using Java version %s%n", getJavaVersion());

        String[] words1 = {"Hi", "there", "Tyler", "Sam"};
        runTest(words1);

        String words2[] = {"Hi", "Hi", "there", "Tyler", "Tyler"};
        runTest(words2);
    }

    private static void runTest(String [] words)
    {
        WordPairsList list = new WordPairsList(words);
        System.out.println(list);
        // For second part below, uncomment this test:
        System.out.format("The number of matched pairs is: %s%n", list.numMatches());
    }

    private static String getJavaVersion()
    {
        Runtime.Version runTimeVersion = Runtime.version();
        return String.format("%s.%s.%s.%s", runTimeVersion.feature(), runTimeVersion.interim(), runTimeVersion.update(), runTimeVersion.patch());
    }
}

