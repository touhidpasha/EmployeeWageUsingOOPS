import java.util.Scanner;

class Employee{
    final int PRESENT,full_day_duration,part_time_hout,full_time ;
    int totoal_working_days ,wage_per_hour;
    int[] cam1=new int[]{20,15};//wage and working days of company1 respectively;
    int[] cam2=new int[]{25,20};
    Employee(){
          PRESENT = 1;
          full_time=0;
          //wage_per_hour=20;
          full_day_duration=8;
          part_time_hout=4;//part time wage 
          //totoal_working_days=20; // number of working days added
          
    }
    public void IsEmpPresent(){
        int var = (int) (Math.random() * 10) % 2,full_time=0;
        int flag,daily_wage;
        Scanner sc=new Scanner(System.in);
        if (var == PRESENT)
            {
                System.out.println(" Enter 1 if emp belong to comapny1 or else for any other company");
                flag=sc.nextInt();
                System.out.println(" Employee is Present");
            //PrintEMPEage();
            if(flag==1)
            {
                wage_per_hour=cam1[0];
                totoal_working_days=cam1[1];

            }
            else{
                wage_per_hour=cam2[0];
                totoal_working_days=cam2[1];
            }
        
            switch(full_time)
            {
                case(1):

                    daily_wage=wage_per_hour*full_day_duration*totoal_working_days;
                    System.out.println(daily_wage);
                    break;
                case 0:
                    daily_wage=part_time_hout*wage_per_hour*totoal_working_days;
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
        emp1.IsEmpPresent();  //this is the class method to fetch data and class variables are inside class implementation
}

    
    
}