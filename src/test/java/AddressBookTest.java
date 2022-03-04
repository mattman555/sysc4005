import org.junit.Test;

import static org.junit.Assert.*;

public class AddressBookTest {
    @Test
    public void addBuddy() {
        AddressBook book1 = new AddressBook();
        assertTrue(book1.book.isEmpty());
        book1.addBuddy("John", "555-555-5555");
        assertFalse(book1.book.isEmpty());
    }
}
