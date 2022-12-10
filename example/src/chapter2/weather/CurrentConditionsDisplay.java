package chapter2.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    // WeatherData객체로 부터 변경사항을 받으려면 Observer를 구현해야함.
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // 푸시 방식
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

//	// 풀 방식
//	@Override
//	public void update() {
//		this.temperature = weatherData.getTemperature();
//		this.humidity = weatherData.getHumidity();
//		display();
//	}


    @Override
    public void display() {
        System.out.println("현재 상태 : 온도 " + temperature
            + "F, 습도: " + humidity + "%");
    }

}
