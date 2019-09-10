public class Application {
    public static void main(String[] args) {
        /*Car car=new Car();
        Van van=new Van();

        Dog dog=new Dog();

        Vehicle<Car> carVehicle=new Vehicle<>(car);
        carVehicle.drive();

        Vehicle<Van> vanVehicle=new Vehicle<>(van);
        vanVehicle.drive();
*/
        //Vehicle<Dog> dogVehicle=new Vehicle<>(dog);
        //dogVehicle.drive();

        ArrayPrinter arrayPrinter=new ArrayPrinter();
        Integer[] integer={1,2,3,4,5,6};
        String[] string={"A","B","C"};
        arrayPrinter.printArray(integer);
        arrayPrinter.printArray(string);
    }
}
