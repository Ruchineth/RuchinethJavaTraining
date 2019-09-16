package enc.type02;


import java.util.ArrayList;

public class BusStation {

    public static ArrayList<Bus> buses=new ArrayList<>();

    public BusStation(String color) {
        buses.add(new Bus(color));
    }

    public BusStation() {
    }

    public static ArrayList<Bus> getBuses() {
        return buses;
    }

    public static void setBuses(ArrayList<Bus> buses) {
        BusStation.buses = buses;
    }
    public void addBus(Bus bus){
        buses.add(bus);

    }
    public void addBus(String color){
        buses.add(new Bus(color));
    }
    class Bus {
        private String color;

    public Bus(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Bus{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}
