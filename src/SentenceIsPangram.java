package src;
import java.util.*;

public class SentenceIsPangram {
    public  static boolean checkIfPangram(String sentence) {

        Set<Character> letters = new HashSet<>();

        for(char ch : sentence.toCharArray()){
            letters.add(ch);
        }
        return letters.size() == 26;

    }
    public static void main(String[] args) {
        String sen = "thequickbrownfoxjumpsoverthelazydog";
        Boolean result = checkIfPangram(sen);
        System.out.println(result);
    }
}
