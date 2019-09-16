package enc.type01;

public class Application {
    public static void main(String[] args) {
        for (Bus bus:BusStation.getBuses()){
            System.out.println(bus);
        }
    }
}
