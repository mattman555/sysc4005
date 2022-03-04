import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public void launch(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppContext.class);
        context.refresh();
    }
    public static void main (String[] args) {
        Launcher launcher = new Launcher();
        launcher.launch();
    }
}
