import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Predicate---> only one parameter and retuen boolean
       // Ex: 1
        Predicate<Integer> p=i->(i>10);
        System.out.println(p.test(66));
        System.out.println(p.test(1));

        // Ex: 2  check the length of a given string is grater than 5 or not

        Predicate<String>p1=i->(i.length()>5);
        System.out.println(p1.test("Hello Bro"));
        System.out.println(p1.test("Hello"));

        // Ex: 3 check the given string is starting with "A" or not

        Predicate<String>p2=i->(i.startsWith("A"));
        System.out.println(p2.test("Arun"));
        System.out.println(p2.test("Ravi"));

        // Ex: 4 check the given number is even or not
        Predicate<Integer>p3=i->(i%2==0);
        System.out.println(p3.test(10));
        System.out.println(p3.test(11));

       // Ex : 5 Print array element whose length is grater than 5
         String[] names={"Arun","Ravi","Raj","Rajesh","Ramesh","Rahul"};
            Predicate<String> p4=i->(i.length()>5);
            for(String name:names){
                if(p4.test(name)){
                    System.out.println(name);
                }
            }
    }
}
