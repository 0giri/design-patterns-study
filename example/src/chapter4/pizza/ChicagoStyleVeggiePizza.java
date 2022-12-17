package chapter4.pizza;

public class ChicagoStyleVeggiePizza extends Pizza{

    public ChicagoStyleVeggiePizza() {
        name = "시카고 스타일 딥 디쉬 치즈 피자";
        dough= "아주 두 꺼운 크러스트 도우";
        sauce = "플럼 토마토소스";

        toppings.add("잘게 조각낸 모짜렐라 치즈");
        toppings.add("야채 추가 추가");
    }

    @Override
    void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
