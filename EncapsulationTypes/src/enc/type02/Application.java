package enc.type02;

public class Application {


    public static void main(String[] args) {
        BusStation busStation=new BusStation();
        busStation.addBus(busStation.new Bus("Red"));
        busStation.addBus("Blue");
        busStation.addBus(new BusStation().new Bus("Black"));
        for (BusStation.Bus bus:BusStation.getBuses()){

            System.out.println(bus);
        }

    }

}
