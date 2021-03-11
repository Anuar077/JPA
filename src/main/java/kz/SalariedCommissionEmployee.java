package kz;

public class SalariedCommissionEmployee extends CommissionEmployee
    {
       private double baseSalary;

       public SalariedCommissionEmployee(String name, String surname,  double sales, double rate, double salary )
      {
         super(name,surname, sales, rate );
        setBaseSalary( salary );
      }

      public void setBaseSalary( double salary )
     {
         if ( salary >= 0.0 )
            baseSalary = salary;
         else
            throw new IllegalArgumentException(
               "Error" );
      }


     public double getBaseSalary()
      {
         return baseSalary;
      }

      // calculate earnings
      @Override
      public double earnings()
      {
     return getBaseSalary() + super.earnings();
      }


      @Override
      public String toString()
     {
      return String.format( "%s %s; %s: $%,.2f",
            "Salaried -", super.toString(),
            "Salary", getBaseSalary() );
     }
      }
