package quotes;

public class Quote {
   public String author;
   public String text;
   public String starWarsQuote;


//  Constructor
   public Quote (String author, String text, String starWarsQuote){
       this.author = author;
       this.text = text;
       this.starWarsQuote = starWarsQuote;
   }

// toString method
   public String toString(){
       return this.author + ": " + this.text;
   }

}
