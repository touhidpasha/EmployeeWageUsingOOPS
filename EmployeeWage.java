class Employee{
    final int PRESENT ,wage_per_hour,full_day_duration,part_time_hout,full_time;
    Employee(){
          PRESENT = 1;
          full_time=0;
          wage_per_hour=20;
          full_day_duration=8;
          part_time_hout=4;//part time wage 


    }
    public void IsEmpPresent(){
        int var = (int) (Math.random() * 10) % 2,full_time=0;
        int daily_wage;
        if (var == PRESENT)
            {System.out.println(" Employee is Present");
            //PrintEMPEage();
        
            switch(full_time)
            {
                case(1):
                    daily_wage=wage_per_hour*full_day_duration;
                    System.out.println(daily_wage);
                    break;
                case 0:
                    daily_wage=part_time_hout*wage_per_hour;
                    System.out.println(daily_wage);
                    break;

                  
            }

        }
           
        else
            System.out.println(" Employee is Absent");
    }
    public void PrintEMPEage(){
        int daily_wage=wage_per_hour*full_day_duration;
            System.out.println(daily_wage);
    }
}

public class EmployeeWage{

    
    public static void main(String[] args) {
        
        System.out.println("welcome to emp wage problem");
        Employee emp1=new Employee();
        emp1.IsEmpPresent();
}

    
    
}