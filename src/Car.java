public class Car {
/*Было
    public String modelName;
    public int wheelsCount;

    Инкапсулируем
 */
    private String modelName;
    private int wheelsCount;

    //Конструируем


    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
