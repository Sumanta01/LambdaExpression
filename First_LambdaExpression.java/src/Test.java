@FunctionalInterface
interface Cab{
    public String bookCab(String source, String destination);
}

// class Uber implements Cab{
//     public void bookCab(String source, String destination){
//         System.out.println("Uber booked from "+source+" to "+destination);
//     }

// }


public class Test {
    public static void main(String[] args) {
        Cab cb=(source, destination)->{System.out.println("Uber booked from "+source+" to "+destination); return ("Price is 5000 Rs !");};
        System.out.println(cb.bookCab("Delhi", "Noida"));
        
    }
    
}
