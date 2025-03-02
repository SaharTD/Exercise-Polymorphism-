public class Car implements Vehicle {
    String model;
    int days;

    public Car() {
    }

    public Car(int days, String model) {
        this.days = days;
        this.model = model;
    }


    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public double calculateRentalCost() {
        double rent=50*days;
        return rent;
    }

    @Override
    public void displayDetails() {
        System.out.println( "\n Car Model: "+this.model
        +"\n Daily Rental Rate: $50.0"+
        "\n  Rental Cost: "+this.calculateRentalCost()+"$");
    }
}
