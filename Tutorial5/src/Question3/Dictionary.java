package Question3;

public class Dictionary extends Book{

    private int words; // number of words in the dictionary
    Dictionary(int words, int pages) {
    // missing line 1 goes here - should call the parent constructor here
        super(pages);
        this.words = words;
    }
    /*** for subquestion 2 implement toString() here ***/

    public String toString(){
        String numPages = super.toString();
        String numWords = ""+words;
        return numWords.concat(" "+numPages);
    }
}
