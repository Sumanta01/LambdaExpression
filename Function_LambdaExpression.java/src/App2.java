import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}


public class App2 {
    public static void main(String[] args) {
        ArrayList<Employee>list=new ArrayList<>();
        list.add(new Employee(100,"Durga",25000));
        list.add(new Employee(200,"Sunny",32000));
        list.add(new Employee(300,"Bunny",30000));
        list.add(new Employee(400,"Chinny",40000));
        list.add(new Employee(500,"Vinny",50000));
        list.add(new Employee(600,"Pinny",60000));
        list.add(new Employee(700,"Ginny",70000));
        list.add(new Employee(800,"Tinny",80000));
        




        Function<Employee,Integer>f=e->{  if(e.salary>25000 && e.salary<45000) 
            return (int) ( e.salary*10/100);
            else if(e.salary>=45000 && e.salary<65000)
            return (int) ( e.salary*20/100);
            else if(e.salary>=65000 && e.salary<85000)
            return (int) ( e.salary*30/100);
            else
            return (int) ( e.salary*40/100);
        
        };
        Predicate<Integer>p=b->b>5000;

       for(Employee emp:list){
              if (p.test(f.apply(emp))){
              System.out.println("Employee Name: "+emp.name);
              System.out.println("Employee Salary: "+emp.salary);
              System.out.println("Employee Bonus: "+f.apply(emp));
              System.out.println();

             
            }
       }
    
       

        
    }
    
}
