package kz;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String name, String surname, double sales, double rate) {
        super(name, surname);
        setGrossSales(sales);
        setCommissionRate(rate);
    }


    public void setCommissionRate(double rate) {
        if (rate > 0.0 && rate < 1.0)
            commissionRate = rate;
        else
            throw new IllegalArgumentException(
                    "ERROR");
    }


    public double getCommissionRate() {
        return commissionRate;
    }


    public void setGrossSales(double sales) {
        if (sales >= 0.0)
            grossSales = sales;
        else
            throw new IllegalArgumentException(
                    "Error");
    }


    public double getGrossSales() {
        return grossSales;
    }

    // calculate earnings
    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

  @Override
    public String toString() {
        return String.format("%s  \nName and surname: %s\n%s: $%,.2f; %s: %.2f",
                "Commission employee:", super.toString(),
                "Gross sales", getGrossSales(),
                "Commission rate", getCommissionRate());
    }
}