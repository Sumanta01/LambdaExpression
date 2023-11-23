import java.util.function.Supplier;
import java.util.Date;
public class App {
    public static void main(String[] args) throws Exception {
        
        Supplier<Date> s=()->new Date();
        System.out.println(s.get());
    }
}
