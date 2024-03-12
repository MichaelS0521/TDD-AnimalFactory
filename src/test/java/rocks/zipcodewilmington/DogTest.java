package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testSpeak() {
        String givenSpeak = "bark!";

        Dog dog = new Dog(null, null, null);

        String retrievedSpeak = dog.speak();

        Assert.assertEquals(givenSpeak, retrievedSpeak);
    }

    @Test
    public void testBirthDate() {
        Date givenBirthDate = new Date();

        Dog dog = new Dog(null, givenBirthDate, null);

        Date retrievedBirthDate = dog.getBirthDate();

        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }

    @Test
    public void testEat() {
        Integer givenNumberOfMealsEaten = 0;

        Dog dog = new Dog(null, null, null);

        Integer retrievedFood = dog.getNumberOfMealsEaten();

        Assert.assertEquals(givenNumberOfMealsEaten, retrievedFood);
    }

    @Test
    public void testId() {
        Integer givenId = 0;

        Dog dog = new Dog(null, null, givenId);

        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void newDog() {
        // Given
        String givenName = "Buddy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
}
