package enc.type01;

import java.util.ArrayList;

public class BusStation {
    public static ArrayList<Bus> buses=new ArrayList<>();

    public static ArrayList<Bus> getBuses() {
        return buses;
    }

    public static void setBuses(ArrayList<Bus> buses) {
        BusStation.buses = buses;
    }
    static {
        buses=new ArrayList<>();
        buses.add(new Bus("red"));
        buses.add(new Bus("blue"));
        buses.add(new Bus("green"));
        buses.add(new Bus("black"));
        buses.add(new Bus("white"));
    }
}
