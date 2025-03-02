public class Bike implements Vehicle{
    private String brand;
    private double hours;


    public Bike() {
    }

    public Bike(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        double rent= hours*hours_rate;
        return rent;
    }

    @Override
    public void displayDetails() {
          System.out.println();
        System.out.println(
       "  Bike Brand: "+this.brand+
       "\nHourly Rental Rate: "+hours_rate+"$"+
       " Rental Cost: "+this.calculateRentalCost()+"$");
    }
}
