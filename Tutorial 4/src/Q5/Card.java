package Q5;

public abstract class Card {
    private String name;
     public Card(){
         name="";
     }
     public Card(String name){
         this.name =name;
     }
     public void setName(String name){
         this.name =name;
     }
     public String getName (){
         return name;
     }
     public abstract boolean isExpired();

     public String format (){
         return "Card Holder "+name;
     }
}
