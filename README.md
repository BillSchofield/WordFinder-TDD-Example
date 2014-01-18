WordFinder-TDD-Example
======================



How do I write my first test?
-----------------------------
There are two common situations when you start a new project and want to write your first test. The entry points to your application
The entry points to the application are not easily testable (e.g. <code>public static void main</code>).
The entry points are easy to test because we are using some kind of framework like SpringMVC.
<pre> <code>
public static void main(String[] args) {
    System.out.println(new WordFinder(dictionary()).findWordsIn("paisley"));
}
private static List<String> dictionary() {
    List<String> dictionary = new ArrayList<String>();
    dictionary.add("paisley");
    dictionary.add("ley");
    ...
    ...
    dictionary.add("count");
    return dictionary;
}
</code> </pre>