
/*Function Chaining:-  1. andThen()  2.compose() */

import java.util.function.Function;

public class App3 {
    public static void main(String[] args) {
        Function<Integer,Integer>f=i->i*2;
        Function<Integer,Integer>f1=i->i*i*i;
        
       System.out.println(f.andThen(f1).apply(2));

       System.out.println(f.compose(f1).apply(2));
        
    }
    
}
