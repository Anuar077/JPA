package kz;

public class SalariedEmployee extends Employee {
    private double baseSalary;

    public SalariedEmployee(String name, String surname, double salary) {
        super(name, surname);
        setBaseSalary(salary);
    }


    public void setBaseSalary(double salary) {
        if (salary >= 0.0)
            baseSalary = salary;
        else
            throw new IllegalArgumentException(
                    "ERROR");
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    @Override
    public double earnings() {
        return getBaseSalary();
    }


    @Override
    public String toString() {

        return String.format("%s\nName and Surname:%s\n%s: $%,.2f",
                "Salaried Employee:", super.toString(), "Base salary", getBaseSalary());
    }
}