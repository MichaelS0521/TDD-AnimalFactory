package rocks.zipcodewilmington.animals;

import rocks.zipcodewilmington.Food;

/**
 * @author leon on 4/19/18.
 */
public interface Animal {
    String speak();
    String getName();
    Integer getNumberOfMealsEaten();
    Integer getId();
    void eat(Food food);

}
