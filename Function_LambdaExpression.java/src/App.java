import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        
        Function<Integer,Integer>f=i->i*i;
        System.out.println(f.apply(4));
        System.out.println(f.apply(25));
        System.out.println(f.apply(6));
        System.out.println(f.apply(17));

        /*Ex-1 Pass String as parameter and return the length of the String as Integer */
        Function<String,Integer>f2=s->s.length();
        System.out.println(f2.apply("Durga"));
        System.out.println(f2.apply("Software Engineer"));
    }
}
