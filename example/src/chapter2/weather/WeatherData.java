package chapter2.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        // 옵저버 등록 요청시
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        // 옵저버 삭제 요청시
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        // 상태가 변경되면 모든 옵저버에게 알려주는 부분
        for(Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        // 기상 스테이션으로부터 갱신된 측정값을 받으면 옵저버에게 알림.
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
