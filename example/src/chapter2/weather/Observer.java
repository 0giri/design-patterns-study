package chapter2.weather;

public interface Observer {
	void update(float temp, float humidity, float pressure);
}
