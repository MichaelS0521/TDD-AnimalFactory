package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testRemoveId() {

        Integer givenId = 0;

        DogHouse.remove(givenId);

        DogHouse.getDogById(givenId);

    }

    @Test
    public void testRemoveDog() {

        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog(null,null,null);
        int expected =  dogHouse.getNumberOfDogs();

        dogHouse.remove(dog);
        int actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

    }


}
