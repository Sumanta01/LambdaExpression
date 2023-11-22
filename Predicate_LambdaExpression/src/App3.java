
/* Joining Predicates : and , or , negate
 * Predicate 1:- check if the number is even
 * predicate 2:- check if number is grater than 50
 * 
 */

import java.util.function.Predicate;

public class App3 {
    public static void main(String[] args) {
        int []arr={162,33,73,22,78,9,80,13};
        Predicate<Integer>p=i->(i%2==0);
        Predicate<Integer>p2=i->i>50;
        for(int i:arr){
            //if(p.test(i) && p2.test(i))
            if(p.and(p2).test(i))
            {
                System.out.print(i+" ");
            }
        }
       System.out.println();
        for(int i:arr){
            if(p.negate().test(i)){
                System.out.print(i+" ");
            }
        }
        
    }
    
}
