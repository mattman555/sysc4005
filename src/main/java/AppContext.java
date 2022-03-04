import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

    @Bean
    public AddressBookGUI view(){
        AddressBookGUI view = new AddressBookGUI();
        return view;
    }

}
