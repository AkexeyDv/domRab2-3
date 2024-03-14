public class Bicycle extends Transport{
    /*Было
    public String modelName;
    public int wheelsCount;
    Исправляем инкапсуляцию
    */

    public Bicycle(String modelName,int wheelsCount) {
        super(modelName, wheelsCount);
    }
 /*   @Override
    public void check() {
        System.out.println("Меняем покрышку");
    }*/
}
