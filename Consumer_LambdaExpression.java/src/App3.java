/*  Consumer Chaining...........   */

import java.util.function.Consumer;
public class App3 {
    public static void main(String[] args) {
        // Create a chain of consumers
        Consumer<String> c1 = s -> System.out.println("His Name in Capitalize: "+s.toUpperCase());
        Consumer<String> c2 = s -> System.out.println(s+" is a Excellent Coder !");
        Consumer<String> c3 = s -> System.out.println(s+" takes part in many more Coding Hackathon");

        // c1.accept("sumanta");
        // c2.accept("sumanta");
        // c3.accept("sumanta");

        //Or
        // Prefered Way

        Consumer<String>c4=c1.andThen(c2).andThen(c3);
        c4.accept("sumanta");
        
        

        
    }
}
