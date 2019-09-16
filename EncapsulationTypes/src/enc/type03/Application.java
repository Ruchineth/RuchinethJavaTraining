package enc.type03;

public class Application {
    public static void main(String[] args) {
        BusStation busStation=new BusStation();
        busStation.addBus("Green");
        busStation.addBus(busStation.new Bus("Red"));
        busStation.addBus(new BusStation().new Bus("Yellow"));
        for (BusStation.Bus bus:busStation.getBuses()){
            System.out.println(bus);
        }
    }
}
