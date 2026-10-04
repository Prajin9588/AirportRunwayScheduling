public class Main {

    public static void main(String[] args) {

        // Create aircraft
        Aircraft a1 = new Aircraft(
                "IND101",
                "LANDING",
                30,
                0,
                5
        );

        Aircraft a2 = new Aircraft(
                "IND102",
                "TAKEOFF",
                80,
                1,
                4
        );

        Aircraft a3 = new Aircraft(
                "IND103",
                "LANDING",
                10,
                2,
                6
        );

        Aircraft a4 = new Aircraft(
                "IND104",
                "TAKEOFF",
                50,
                3,
                4
        );

        Aircraft a5 = new Aircraft(
                "IND105",
                "LANDING",
                5,
                4,
                5
        );

        // Display aircraft information
        System.out.println("===== AIRCRAFT DETAILS =====");

        displayAircraft(a1);
        displayAircraft(a2);
        displayAircraft(a3);
        displayAircraft(a4);
        displayAircraft(a5);
    }

    public static void displayAircraft(Aircraft aircraft) {

        System.out.println(
                "ID: " + aircraft.getId()
        );

        System.out.println(
                "Type: " + aircraft.getType()
        );

        System.out.println(
                "Fuel Level: " + aircraft.getFuelLevel()
        );

        System.out.println(
                "Arrival Time: " + aircraft.getArrivalTime()
        );

        System.out.println(
                "Service Time: " + aircraft.getServiceTime()
        );

        System.out.println("----------------------------");
    }
}