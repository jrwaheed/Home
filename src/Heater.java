public class Heater implements Observers{
    @Override
    public void info(int temperature) {
        System.out.println("The heater is recording a temperature of " + temperature);
    }

    public void heatUp(){

    }

    public void heatDown(){

    }

    public void heatSame(){

    }
}
