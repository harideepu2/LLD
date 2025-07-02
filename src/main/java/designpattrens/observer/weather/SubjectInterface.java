package designpattrens.observer.weather;

public interface SubjectInterface {

    public void add(ObserverInterface observer);
    public void remove(ObserverInterface observer);

    public void notifyObservers();
    public void setTemp(int temp);
    public int getTemp();
}
