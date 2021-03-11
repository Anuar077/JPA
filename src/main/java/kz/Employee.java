package kz;

public abstract class Employee {
      private String name;
      private String surname;


      // two argument constructor
      public Employee( String name1, String name2)
     {
         name = name1;
         surname = name2;

}

    // set first name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



     @Override
      public String toString()
      {
         return String.format( "%s %s ",
             getName(), getSurname());
      }


      public abstract double earnings();

   } // end abstract class Employee
