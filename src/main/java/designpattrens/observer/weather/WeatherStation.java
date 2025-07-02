package designpattrens.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements SubjectInterface{

    private List<ObserverInterface> observers;
    private int temp;
    public WeatherStation(){
        this.observers = new ArrayList<ObserverInterface>();
        this.temp=0;
    }
    @Override
    public void add(ObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public void remove(ObserverInterface observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(ObserverInterface observer: observers){
            observer.update(temp);
        }
        System.out.println("***************************");
    }

    @Override
    public void setTemp(int newtemp) {
        if(temp != newtemp){
            temp = newtemp;
            notifyObservers();
        }
        else {
            System.out.println("No change in Temperature");
        }
    }

    @Override
    public int getTemp() {
        return temp;
    }
}
