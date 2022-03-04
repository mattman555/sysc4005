import org.junit.Test;

import static org.junit.Assert.*;

public class BuddyInfoTest {

    @Test
    public void getName() {
        BuddyInfo buddy = new BuddyInfo("Jane","555-555-5556");
        assertTrue(buddy.getName().equals("Jane"));
    }

    @Test
    public void getPhoneNumber() {
        BuddyInfo buddy = new BuddyInfo("Jane","555-555-5556");
        assertTrue(buddy.getPhonenumber().equals("555-555-5556"));
    }
}