package designpattrens.observer.weather;

public class WeatherClient {
    public static void main(String[] args) {
        SubjectInterface ws = new WeatherStation();
        ObserverInterface tv = new TVObserver();
        ObserverInterface mobile = new MobileObserver();
        ObserverInterface tab = new TabObserver();

        ws.add(tv);
        ws.add(mobile);
        ws.add(tab);

        ws.setTemp(30);

        ws.remove(tab);
        ws.setTemp(35);

        ws.setTemp(35);
    }
}
