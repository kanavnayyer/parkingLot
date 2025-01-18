/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoliticsAssign1;

/**
 *
 * @author kanav
 */
//Consider the politics use cases :
//MP: is a person who won from a constituency 
//getConstituency - return their winning constituency.
//getDriver - returns the driver assigned for their vehicle (default car).
//exceedsSpendingLimit - returns true or false if Mps exceeds to their spending limit.
//PM->Ministers->MP (All of them are MPS) - PM has special permissions such as it can give permission to arrest any minister.
//PM enjoys special benefits such as Aircraft (along with car) and its designated driver. 
//Note: PM spending limit : 1 crore, Ministers: 10 lakhs, MP: 1 lakh.
//Need to design in a way  where Commisioner class can arrest MP,
//Ministers and PM when their expense exceeds their spending limit:
//canArrest - can arrest one or many MP.  
//          Note: If PM  cant arrest.
//                If minister can arrest with PM permission
//                if mps they can be arrested without anyones permission.
//In Short, If the MP is not PM then he can be arrested by commisoner , If he is minister then can be arrested with PMs permisison.
public class Politics {

    public static void main(String[] args) {

        // creting object mp
        MP mp = new MP("Manjitha", "Doaba");
        // creating object cm
        Commisioner cm = new Commisioner();

        Driver mpDriver = new Driver("raj", "innova");

        Driver ministerDriver = new Driver("vinay", "Fortuner");

        Driver pmDriver = new Driver("daksh", "Suv");

        mp.assignDriver(mpDriver);// assigning driver

        mp.hasSpend(50000);

        System.out.println("can commisioner arrest Mp "
                + mp.getName() + " from "
                + mp.getConstituency() + ":-"
                + cm.canIArrest(mp));

        mp.hasSpend(55777);
        if (mp.getName() != null) {
            System.out.println("can commisioner arrest Mp "
                    + mp.getName() + " from "
                    + mp.getConstituency()
                    + ":- " + cm.canIArrest(mp));
        } else {
            System.out.println("No name");
        }

        if (mp.getDriver() != null) {
            System.out.println(mp.getName()
                    + " has been allocated"
                    + mp.getDriver().getName()
                    + " and car  "
                    + mp.getDriver().getVehicleAssigned());
        } else {
            System.out.println("No Driver");
        }

        // minister code starts here 
        System.out.println("MINISTER\n\n");
        Minister min = new Minister("Kejriwal", "Delhi");
        min.assignDriver(ministerDriver);

        min.hasSpend(144679);

        System.out.println("can commisioner  arrest minister"
                + min.getName()
                + " from constituency" + " "
                + min.getConstituency() + ":- "
                + cm.canIArrest(min));

        min.hasSpend(900000);
        System.out.println("can commisioner  arrest minister" + min.getName()
                + " from constituency"
                + " " + min.getConstituency()
                + ":- " + cm.canIArrest(min));

        // null checks
        if (min.getDriver() != null) {
            System.out.println(min.getName() + " has been allocated "
                    + min.getDriver().getName()
                    + " and car  "
                    + min.getDriver().getVehicleAssigned());
        } else {
            System.out.println("Car driver not alliocated");
        }

        System.out.println("\n");

        // primeminister code startss here
        System.out.println("\t+PRIME MINISTER\n");

        PM pm = new PM("Narendra Modi", "Rajkot");
        pm.hasSpend(400000000);

        System.out.println("can commisioner  arrest Primeminister" + pm.getName()
                + " from constituency" + " " + pm.getConstituency() + ":- " + cm.canIArrest(pm));

        // Assigning car driver
        pm.assignDriver(pmDriver);

        // Assigning aircraft driver
        AircraftDriver aircraftDriver = new AircraftDriver("Pilot Rohan", "Boeing", true);
        pm.assignAirCraftDriver(aircraftDriver);

        // null check
        if (pm.getDriver() != null) {
            System.out.println("PM car driver name: " + pm.getDriver().getName()
                    + ", vehicle assigned: " + pm.getDriver().getVehicleAssigned());
        } else {
            System.out.println("PM car driver is not assigned.");
        }

        //  null check
        if (pm.getAirCraftDriver() != null) {
            System.out.println("PM aircraft driver name: " + pm.getAirCraftDriver().getName()
                    + ", aircraft model: " + pm.getAirCraftDriver().getVehicleAssigned()
                    + " has special permission: " + pm.getAirCraftDriver().isHasSpecialPermission());
        } else {
            System.out.println(" not assigned yet.");
        }
    }

}
