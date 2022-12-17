package chapter4.pizza2;

import chapter4.pizza2.ingredient.Cheese;
import chapter4.pizza2.ingredient.Clams;
import chapter4.pizza2.ingredient.Dough;
import chapter4.pizza2.ingredient.Sauce;
import chapter4.pizza2.ingredient.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Clams createClam();

}
