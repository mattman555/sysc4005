import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany( cascade = CascadeType.PERSIST)
    public ArrayList<BuddyInfo> book;

    public AddressBook() {
        book = new ArrayList<>();
    }

    public AddressBook(Integer id) {
        this.id=id;
        book = new ArrayList<>();
    }

    public void addBuddy(String name, String number){
        book.add(new BuddyInfo(name, number));
    }
    public void addBuddy(BuddyInfo buddy){
        book.add(buddy);
    }

    @Override
    public String toString() {
        String addressBook = "Addressbook = {";
        for (BuddyInfo buddy : book){
            addressBook+=(buddy.toString()+", ");
        }
        addressBook+="}";
        return addressBook;
    }
    public static void main(String[] args){
        AddressBook book1 = new AddressBook();
        book1.addBuddy("John","555-555-5555");
        book1.addBuddy("Jane","555-555-5556");
        System.out.println(book1.toString());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
