public class Mobile implements Observers{

    @Override
    public void info(int temperature) {
        System.out.println("The mobile phone is recording a temperature of " + temperature);
    }

    public void soundAlarm(){

    }
}
