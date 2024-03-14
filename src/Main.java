public class Main {
    public static void main(String[] args) {
        Transport[] transports={new Car("Lada Kalina", 4),
        new Bicycle("Горный",2),
        new Truck("Газель",4),
        new Car("Ford", 4),
        new Bicycle("Stels",2),
        new Truck("Man",8)};
        //car.check();
        for (Transport transport : transports) {
            transport.check();
            linePrint();

        }



    }
    public static void linePrint(){
        System.out.println("___________________________________");
    }
}
