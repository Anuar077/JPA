package kz;

public class HourlyEmployee extends Employee
   {
       private double wage;
       private double hours;

      // five-argument constructor
      public HourlyEmployee(String name, String surname, double hourlyWage, double hoursWorked )
      {
         super(name,surname);
         setWage( hourlyWage );
         setHours( hoursWorked );
      }


      public void setWage( double hourlyWage )
      {
         if ( hourlyWage >= 0.0 )
            wage = hourlyWage;
         else
            throw new IllegalArgumentException(
               "Error" );
      }


      public double getWage()
      {
         return wage;
     } // end method getWage


      public void setHours( double hoursWorked )
      {
         if ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) )
            hours = hoursWorked;
         else
            throw new IllegalArgumentException(
                    "Error" );
      }


      public double getHours()
      {
         return hours;
      }

      // calculate earnings
      @Override
      public double earnings()
     {
      if ( getHours() <= 40 )
      return getWage() * getHours();
      else
      return 40 * getWage() + ( getHours() -  40 ) * getWage() *  1.5 ;
      }



      @Override
      public String toString()
      {
      return String.format( "%s\nName and Surname: %s\n%s: $%,.2f; %s: %,.2f",
      "Hourly employee:",super.toString(), "Hourly wage" , getWage(),
        "Hours worked", getHours() );
      }
   } // end class HourlyEmployee