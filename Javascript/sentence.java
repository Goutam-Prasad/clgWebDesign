/**
 * sentence
 */
public class sentence {

    public static String longestWord(String sentenc) {

        String[] s = sentenc.split("");
        int len = 0;
        String res = "";

        for (String word : s) {
            if (word.length() > len && word.length() % 2 == 0) {
                len = word.length();
                res = word;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String result = longestWord("It is pleasant day today");
        System.out.println(result);
    }
}