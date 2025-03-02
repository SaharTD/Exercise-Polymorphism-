public class Truck implements Vehicle{
    String type;
    int week;

    public Truck() {
    }

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        double rent=500*week;
        return rent;
    }

    @Override
    public void displayDetails() {
        System.out.println( "\n Truck Type: "+this.type
                +"\n Weekly Rental Rate: $500.0"+
                "\nRental Cost: "+this.calculateRentalCost()+"$");
    }
}
