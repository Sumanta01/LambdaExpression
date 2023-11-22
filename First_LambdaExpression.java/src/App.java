@FunctionalInterface
interface Cab{
    public void bookCab();

}

// class Uber implements Cab{
//     // public void bookCab(){
//     //     System.out.println("Uber booked !");
//     // }
//     ()-> System.out.println("Uber booked !");
// }




public class App {
    public static void main(String[] args) throws Exception {
        Cab ub=()->System.out.println("Uber booked !");  //Lambda Expression
        ub.bookCab();
    }
}
