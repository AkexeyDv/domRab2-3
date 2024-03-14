public class Bicycle {
    /*Было
    public String modelName;
    public int wheelsCount;
    Исправляем инкапсуляцию
    */
    private String modelName;
    private int wheelsCount;
    //Поля класса теперь приватные и доступа извне к ним нет. Поэтому...
    // Добавляем конструктор

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
