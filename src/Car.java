public class Car implements Vehicle {
    private String model;
    private int days;

    public Car() {
    }

    public Car(String model,int days) {
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
        double rent=days_rate*days;
        return rent;
    }

    @Override
    public void displayDetails() {
        System.out.println();
        System.out.println( "\n Car Model: "+this.model
        +"\n Daily Rental Rate: "+days_rate+"$"+
        "\n  Rental Cost: "+this.calculateRentalCost()+"$");
    }
}
