package org.billschofield.tdd.wordfinder;

import java.util.List;

public class WordFinder {
    private List<String> dictionary;

    public WordFinder(List<String> dictionary) {
        this.dictionary = dictionary;
    }

    public String findWordsIn(String source) {
        return dictionary.get(0);
    }
}
