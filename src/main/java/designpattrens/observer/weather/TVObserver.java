package designpattrens.observer.weather;

public class TVObserver implements ObserverInterface{

    @Override
    public void update(int temp) {
        System.out.println("TV current Temp: " +temp);
    }
}
