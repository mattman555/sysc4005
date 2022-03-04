import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private static final String template = "Hello, %s!";
    private final AtomicLong bookCounter = new AtomicLong();
    private final AtomicLong buddyCounter = new AtomicLong();

    @GetMapping("/MakeBook")
    public AddressBook bookMaker() {
        return new AddressBook((int) bookCounter.incrementAndGet());
    }

    @GetMapping("/Addbuddy")
    public BuddyInfo buddyAdder(@RequestParam(name="name", required = true)String name) {
        return new BuddyInfo((int) buddyCounter.incrementAndGet(),name);
    }
    @GetMapping("/DisplayBook")
    public String viewer() {
        return new AddressBook().toString();
    }
}