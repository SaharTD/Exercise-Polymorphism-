public class Truck implements Vehicle{
   private String type;
    private int week;

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
        double rent=week_rate*week;
        return rent;
    }

    @Override
    public void displayDetails() {
        System.out.println();
        System.out.println( "\n Truck Type: "+this.type
                +"\n Weekly Rental Rate: "+week_rate+"$"+
                "\nRental Cost: "+this.calculateRentalCost()+"$");
    }
}
