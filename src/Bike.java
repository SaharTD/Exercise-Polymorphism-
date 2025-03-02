public class Bike implements Vehicle{
    String brand;
    double hours;

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
        double rent= hours*10;
        return rent;
    }

    @Override
    public void displayDetails() {
        System.out.println(
       "  Bike Brand: "+this.brand+
       "\nHourly Rental Rate: 10$"+
       " Rental Cost: "+this.calculateRentalCost()+"$");
    }
}
