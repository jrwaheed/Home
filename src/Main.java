import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Heater h1 = new Heater();
        Windows w1 = new Windows();



        Sensor sensor = new Sensor(31);

        sensor.addObserver(m1, m1);
        sensor.addObserver(h1, h1);
        sensor.addObserver(w1, w1);

        sensor.sendSignal();

    }
}
