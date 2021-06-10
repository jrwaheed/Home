import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Sensor {

    private int temperature;
    private List<Observers> observerList;

    public Sensor(int temperature, List<Observers> observerList) {
        this.temperature = temperature;
        this.observerList = new ArrayList<Observers>();
    }


    public void addObserver(Observers observers){
        this.observerList.add(observers);
}

    public void informAll(int temperature, Observers observers){
        for (Observers observer:this.observerList) {
            observer.info(this.temperature);
        }
    }
}

