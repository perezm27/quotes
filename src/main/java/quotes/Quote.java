package quotes;

public class Quote {
   public String author;
   public String singleQuote;


//  Constructor
   public Quote (String author, String singleQuote){
       this.author = author;
       this.singleQuote = singleQuote;
   }

// toString method
   public String toString(){
       return this.author + ": " + this.singleQuote;
   }

}
