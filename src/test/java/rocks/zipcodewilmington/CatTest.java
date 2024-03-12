package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void testSetName() {
        String givenName = "Chet";

        Cat cat = new Cat(givenName, null, null);

        String retrievedName = cat.getName();

        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void testSpeak() {
        String givenSpeak = "meow!";

        Cat cat = new Cat(null,null,null);

        String retrievedSpeak = cat.speak();

        Assert.assertEquals(givenSpeak, retrievedSpeak);
    }

    @Test
    public void testBirthDate() {
        Date givenBirthDate = new Date();

        Cat cat = new Cat(null,givenBirthDate,null);

        Date retrievedBirthDate = cat.getBirthDate();

        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }

    @Test
    public void testEat() {
        Integer givenNumberOfMealsEaten = 0;

        Cat cat = new Cat(null,null,null);

        Integer retrievedFood = cat.getNumberOfMealsEaten();

        Assert.assertEquals(givenNumberOfMealsEaten, retrievedFood);
    }

    @Test
    public void testId() {
        Integer givenId = 0;

        Cat cat = new Cat(null,null,givenId);

        Integer retrievedId = cat.getId();

        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
