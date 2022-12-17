package chapter4.pizza2;

import chapter4.pizza.ChicagoPizzaStore;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
//		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("이든의 주문: " + pizza);

		pizza = nyStore.orderPizza("clam");
		System.out.println("이든의 주문: " + pizza);
	}
}
