public class Windows implements Observers{
    @Override
    public void info(int temperature) {
        System.out.println("The heater is recording a temperature of " + temperature);
    }

    public void goUp(){

    }

    public void goDown(){

    }
}
