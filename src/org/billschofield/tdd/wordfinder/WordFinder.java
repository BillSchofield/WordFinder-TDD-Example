package org.billschofield.tdd.wordfinder;

import java.util.ArrayList;
import java.util.List;

import static com.sun.deploy.util.StringUtils.join;

public class WordFinder {
    private List<String> dictionary;

    public WordFinder(List<String> dictionary) {
        this.dictionary = dictionary;
    }

    public String findWordsIn(String source) {
        List<String> foundWords = new ArrayList<String>();
        for (String word : dictionary) {
            if (source.contains(word)){
                foundWords.add(word);
            }
        }
        return join(foundWords, ",\n");
    }
}
