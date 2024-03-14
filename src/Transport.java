public abstract class Transport implements ServiceStation {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }


    public int getWheelsCount() {
        return wheelsCount;
    }
    public void check(){
        System.out.println(getModelName());
        System.out.println("Меняем покрышку");
        if(getClass()==Car.class||getClass()==Truck.class){
            System.out.println("Проверяем двигатель");
        }
        if(getClass()==Truck.class){
            System.out.println("Проверяем прицеп");
        }



    }


}
