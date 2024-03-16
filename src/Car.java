public class Car extends Transport{
/*Было
    public String modelName;
    public int wheelsCount;
*/
    public Car(String modelName,int wheelsCount) {
        super(modelName, wheelsCount);
    }




@Override
    public void check() {
        System.out.println(getModelName());
        System.out.println("Меняем покрышку");
        System.out.println("Проверяем двигатель");
    }

}
