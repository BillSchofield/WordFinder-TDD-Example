import org.billschofield.tdd.wordfinder.WordFinder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(new WordFinder(dictionary()).findWordsIn("paisley"));
    }

    private static List<String> dictionary() {
        List<String> dictionary = new ArrayList<String>();
        dictionary.add("paisley");
        dictionary.add("ley");
        dictionary.add("aisle");
        dictionary.add("isle");
        dictionary.add("king");
        dictionary.add("queen");
        dictionary.add("prince");
        dictionary.add("duke");
        dictionary.add("count");
        return dictionary;
    }
}
