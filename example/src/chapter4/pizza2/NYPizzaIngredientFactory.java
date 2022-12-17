package chapter4.pizza2;

import chapter4.pizza2.ingredient.Cheese;
import chapter4.pizza2.ingredient.Clams;
import chapter4.pizza2.ingredient.Dough;
import chapter4.pizza2.ingredient.FreshClams;
import chapter4.pizza2.ingredient.Garlic;
import chapter4.pizza2.ingredient.MarinaraSauce;
import chapter4.pizza2.ingredient.Mushroom;
import chapter4.pizza2.ingredient.Onion;
import chapter4.pizza2.ingredient.Pepperoni;
import chapter4.pizza2.ingredient.ReggianoCheese;
import chapter4.pizza2.ingredient.Sauce;
import chapter4.pizza2.ingredient.SlicedPepperoni;
import chapter4.pizza2.ingredient.Spinach;
import chapter4.pizza2.ingredient.ThinCrustDough;
import chapter4.pizza2.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new Spinach()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}

