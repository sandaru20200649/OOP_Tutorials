package Q2;

public class MainQ2 {
    public static void main(String[] args)
    {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";


        String  concatination =  article.concat(" ").concat(animal1).concat(" ").concat(action).concat(" the ").concat(animal2);
        System.out.println(concatination);

        System.out.println(animal1 + " " + animal2 + " " + article + " " + action);
    }
}
