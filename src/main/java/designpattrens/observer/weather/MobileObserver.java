package designpattrens.observer.weather;

public class MobileObserver implements ObserverInterface {
    @Override
    public void update(int temp) {
        System.out.println("Tab current Temp: " +temp);
    }
}
