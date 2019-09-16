package enc.type03;

import java.util.ArrayList;

public class BusStation {

    public static ArrayList<Bus> buses=new ArrayList<>();

    public BusStation(String color) {
        buses.add(new Bus(color));
    }

    public BusStation() {
    }

    public ArrayList<Bus> getBuses() {
        for(int i=0;i<buses.size();i++){
            validate(buses.get(i).getColor());
        }
        return buses;
    }

    public void setBuses(ArrayList<Bus> buses) {
        BusStation.buses = buses;
    }
    public void addBus(Bus bus){
        buses.add(bus);

    }
    public void addBus(String color){
        buses.add(new Bus(color));
    }
    public void validate(String color){
        class BusValidate{
            public void colorValidate(){
                if ("Red".equalsIgnoreCase(color))
                    System.out.println("Valid");
                else System.out.println("InValid");
            }
        }
        new BusValidate().colorValidate();
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

