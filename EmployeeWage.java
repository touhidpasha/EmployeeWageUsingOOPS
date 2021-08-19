class Employee{
    final int PRESENT;
    Employee(){
          PRESENT = 1;


    }
    public void IsEmpPresent(){
        int var = (int) (Math.random() * 10) % 2,full_time=0;
        int daily_wage;
        if (var == PRESENT)
            System.out.println(" Employee is Present");
           
        else
            System.out.println(" Employee is Absent");
    }
}

public class EmployeeWage{

    
    public static void main(String[] args) {
        
        System.out.println("welcome to emp wage problem");
        Employee emp1=new Employee();
        emp1.IsEmpPresent();
}

    
    
}