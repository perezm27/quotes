package quotes;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuoteTest {

    @Test
    public void testToString() {
        Quote newQuote = new Quote("Doggo", "fjsldfjdfdsds");

        assertEquals("Doggo: fjsldfjdfdsds",newQuote.toString());
    }
}