package org.billschofield.tdd.wordfinder;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class WordFinderTest {

    private List<String> dictionary;
    private WordFinder wordFinder;

    @Before
    public void setUp() throws Exception {
        dictionary = new ArrayList<String>();
        wordFinder = new WordFinder(dictionary);
    }

    @Test
    public void shouldFindWordWhenTheEntireStringIsADictionaryWord() {
        dictionary.add("paisley");

        String wordsInDictionary = wordFinder.findWordsIn("paisley");

        assertThat(wordsInDictionary, is("paisley"));
    }

    @Test
    public void shouldFindTheDictionaryWordWhenTheStringStartsWithADictionaryWord() {
        dictionary.add("ant");

        String wordsInDictionary = wordFinder.findWordsIn("antebellum");

        assertThat(wordsInDictionary, is("ant"));
    }

    @Test
    public void shouldFindWordWhenTheEntireStringIsADictionaryWordAndThereIsMoreThanOneWordInTheDictionary() {
        dictionary.add("park");
        dictionary.add("paisley");

        String wordsInDictionary = wordFinder.findWordsIn("paisley");

        assertThat(wordsInDictionary, is("paisley"));
    }

    @Test
    public void shouldFindNothingWordWhenTheStringContainsNoDictionaryWords() {
        dictionary.add("paisley");

        String wordsInDictionary = wordFinder.findWordsIn("qqq");

        assertThat(wordsInDictionary, is(""));
    }

    @Test
    public void shouldFindMultipleWords() {
        dictionary.add("paisley");
        dictionary.add("isle");
        dictionary.add("prince");

        String wordsInDictionary = wordFinder.findWordsIn("paisley");

        assertThat(wordsInDictionary, allOf(containsString("paisley"), anyOf(containsString("isle,"), containsString("\nisle"))));
    }

}
