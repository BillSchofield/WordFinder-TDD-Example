package org.billschofield.tdd.wordfinder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WordFinderTest {

    @Test
    public void shouldFindWordWhenTheEntireStringIsADictionaryWordGWT() {
        // Given
        String theWord = "paisley";
        List<String> dictionary = new ArrayList<String>();
        WordFinder wordFinder = new WordFinder(dictionary);

        // When
        String wordsInDictionary = wordFinder.findWordsIn(theWord);

        //Then
        assertThat(wordsInDictionary, is(theWord));
    }

    @Test
    public void shouldFindWordWhenTheEntireStringIsADictionaryWordAAA() {
        // Arrange objects
        String theWord = "paisley";
        List<String> dictionary = new ArrayList<String>();
        WordFinder wordFinder = new WordFinder(dictionary);

        // perform Action
        String wordsInDictionary = wordFinder.findWordsIn(theWord);

        // Assert correct result
        assertThat(wordsInDictionary, is(theWord));
    }
}
