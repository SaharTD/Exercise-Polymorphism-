import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();


        System.out.println("Hello, Welcome to the car rental shop\n" +
                "Please choose from the menu below:");


        Scanner input= new Scanner(System.in);
        int flag=1;
        while(flag!=0){

            System.out.println(
                            "\nEnter 1 : to Rent a car"+
                            "\nEnter 2 : to Rent a Bike"+
                            "\nEnter 3: to Rent a Truck"+
                            "\nEnter 4: to View Rented Vehicles"+
                            "\nEnter 5 : to exit the program");
            int c = input.nextInt();

            switch (c){

            case 1 :
                System.out.println("Enter Car Model:");
                String m = input.next();
                System.out.println("Enter Rental Days:");
                int d = input.nextInt();
                Vehicle car1 =new Car(d,m);
                rentedVehicles.add(car1);
                car1.displayDetails();

                break;

                case 2:
                    System.out.println("Enter Bike Brand:");
                    String b = input.next();
                    System.out.println("Enter Bike hours:");
                    int h = input.nextInt();
                    Vehicle bike1 =new Bike(b,h);
                    rentedVehicles.add(bike1);
                    bike1.displayDetails();

                    break;

                case 3:
                    System.out.println("Enter Truck Type:");
                    String t = input.next();
                    System.out.println("Enter Truck Weeks:");
                    int w = input.nextInt();
                    Vehicle truck1 =new Truck(t,w);
                    rentedVehicles.add(truck1);
                    truck1.displayDetails();

                    break;

                case 4:
                    for (int i = 0; i <rentedVehicles.size() ; i++) {
                        rentedVehicles.get(i).displayDetails();
                        System.out.println();
                    }

                    break;



                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System! ");
                    flag=0;
                    break;





        }


}


    }







    }



