import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String name;
    int salary;
    int  age;

    Employee(String name,int salary, int age){
        this.name=name;
        this.salary=salary;
        this.age=age;
    }

}

public class App2 {
    public static void main(String[] args) {
        //emp obj: return name if salary> 25 k and age> 20
        ArrayList<Employee>list=new ArrayList<>();
        list.add(new Employee("Arun", 27000, 21));
        list.add(new Employee("Ravi", 15000, 20));
        list.add(new Employee("Raj", 35000, 23));
        list.add(new Employee("Rajesh", 22000, 18));
        list.add(new Employee("Ramesh", 21000, 19));
        list.add(new Employee("Rahul", 65000, 26));

    
        Predicate<Employee>p=i->(i.salary>25000 && i.age>20);
        for(Employee emp:list){
            if(p.test(emp)){
                System.out.println(emp.name);
            }
        }
        

        
    }
}
