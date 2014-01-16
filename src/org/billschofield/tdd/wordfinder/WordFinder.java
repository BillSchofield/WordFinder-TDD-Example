package org.billschofield.tdd.wordfinder;

import java.util.List;

public class WordFinder {
    private List<String> dictionary;

    public WordFinder(List<String> dictionary) {
        this.dictionary = dictionary;
    }

    public String findWordsIn(String source) {
        for (String word : dictionary) {
            if (source.contains(word)){
                return word;
            }
        }
        return "";
    }
}
