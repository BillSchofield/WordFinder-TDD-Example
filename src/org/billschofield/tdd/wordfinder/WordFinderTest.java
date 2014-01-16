package org.billschofield.tdd.wordfinder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WordFinderTest {

    @Test
    public void shouldFindWordWhenTheEntireStringIsADictionaryWord() {
        String theWord = "paisley";
        List<String> dictionary = new ArrayList<String>();
        WordFinder wordFinder = new WordFinder(dictionary);

        String wordsInDictionary = wordFinder.findWordsIn(theWord);

        assertThat(wordsInDictionary, is(theWord));
    }
}
