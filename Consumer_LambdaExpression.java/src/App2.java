import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

class Employee{
    String name;
    int salary;
    String gender;

    Employee(String name, int salary, String geneder){
        this.name = name;
        this.salary = salary;
        this.gender = geneder;
    }

}


public class App2 {

    public static void main(String[] args) {

        ArrayList<Employee>emplist=new ArrayList<>();
        emplist.add(new Employee("John", 15000, "Male"));
        emplist.add(new Employee("Sara", 20000, "Female"));
        emplist.add(new Employee("Senira", 54000, "Female"));
        emplist.add(new Employee("Luxy", 46000, "Female"));
        emplist.add(new Employee("David", 68000, "Male"));
        emplist.add(new Employee("Smith", 29000, "Male"));
        emplist.add(new Employee("Luana", 60000, "Female"));
        emplist.add(new Employee("Pep", 37000, "Male"));


        Function<Employee,Integer>f=e->(e.salary*10)/100;  //Task 1: Calculate the Bonus of the employee

        Predicate<Integer>p=b->b>=5000;  // Task 2: Calculate the bonus is grater than 5000

        Consumer<Employee>c=o->{
            System.out.println("Name of the Employee: "+o.name);
            System.out.println("Salary of the Employee: "+o.salary);
            System.out.println("Gender of the Employee: "+o.gender);

        };

        for(Employee i:emplist){
            int bonus=f.apply(i);
            if(p.test(bonus)){
                c.accept(i);
                System.out.println("Bonus of the Employee: "+bonus);
                System.out.println();
            }
        }



        




    }
    
}
