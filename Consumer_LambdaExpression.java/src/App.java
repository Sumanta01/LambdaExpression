import java.util.function.Consumer;

public class App {
    public static void main(String[] args) throws Exception {
         Consumer<String> c=r-> System.out.println(r);
            c.accept("Hello");
            c.accept("Coding.......");
    




    }
}
