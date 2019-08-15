package quotes;

public class Quote {
   public String author;
   public String text;


//  Constructor
   public Quote (String author, String text){
       this.author = author;
       this.text = text;
   }

// toString method
   public String toString(){
       return this.author + ": " + this.text;
   }

}
