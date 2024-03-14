public class Main {
    public static void main(String[] args) {
        Transport car1=new Car("Lada Kalina", 4);
        Transport bicycle1=new Bicycle("Горный",2);
        Transport truck1=new Truck("Газель",4);
        Transport car2=new Car("Ford", 4);
        Transport bicycle2=new Bicycle("Stels",2);
        Transport truck2=new Truck("Man",8);
        //car.check();
        car1.check();
        linePrint();
        car2.check();
        linePrint();
        bicycle1.check();
        linePrint();
        bicycle2.check();
        linePrint();
        truck1.check();
        linePrint();
        truck2.check();
        System.out.println();
    }
    public static void linePrint(){
        System.out.println("___________________________________");
    }
}
