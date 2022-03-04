import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BuddyInfo {

    @Id
    @GeneratedValue
    private Integer id;
    private String name, phonenumber;

    public BuddyInfo() {
    }

    public BuddyInfo(String name, String phonenumber) {
        this.setName(name);
        this.setPhonenumber(phonenumber);
    }
    public BuddyInfo(Integer id,String name) {
        this.setName(name);
    }
    public BuddyInfo(Integer id, String name, String phonenumber) {
        this.setId(id);
        this.setName(name);
        this.setPhonenumber(phonenumber);
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhonenumber() {
        return phonenumber;
    }


    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public BuddyInfo getBuddy() {
        return this;
    }
}
