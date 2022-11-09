package Q3;

public class Dictionary extends Book{

    private int words;
    Dictionary(int words, int pages) {
        super(pages); // missing line 1
        this.words = words;
    }

    public String toString() {
        String numofpages = "Number of pages: " + super.toString();
        String numofwords = "Number of words: " + words;
        return numofwords.concat(" "+numofpages);

    }
}