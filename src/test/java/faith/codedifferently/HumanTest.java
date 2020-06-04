package faith.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    
    @Test
    public void constructorTest(){
        //Given : create the data we plan to use for the test
        String first = "Fred";
        String last = "Flintstone";
        int energy = 50; 

        //When: Constructing the new object
        Human testHuman = new Human(first, last);
        String actualFirst = testHuman.getFirst(); 
        String actualLast = testHuman.getLast();
        int actualEnergy = testHuman.getEnergy();

        //Then : look to see if the value we created result match the expected
        //aka the comparison
        Assert.assertEquals(first, actualFirst);
        Assert.assertEquals(last, actualLast);
        Assert.assertEquals(energy, actualEnergy);

    }

    @Test

    public void eatTest(){
        //given 
        Fruit pineapple = new Fruit("Pineapple", 10);
        int expectedEnergy = 60;
        Human testHuman = new Human("Barney", "Rubble");

        //when
        testHuman.eat(pineapple);
        int actualEnergy = testHuman.getEnergy();
    
        //then
        Assert.assertEquals(expectedEnergy, actualEnergy);

    
    }

    @Test
    public void workTest(){
        //given
        Human testHuman = new Human("Faith", "Perez");
        int expectedEnergy = 30; // every hour looses 10 energy
        
        //when
        testHuman.work(2);
        int actualEnergy = testHuman.getEnergy();//did the actual energy go down?
    
        //then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test

    public void energyMaxTest(){
       //given
        Human testHuman = new Human("Bobby", "Flannagan");
        Fruit testFruit1 = new Fruit("Dragon Fruit", 20);
        Fruit testFruit2 = new Fruit("Orange", 20);
        Fruit testFruit3 = new Fruit("Apple", 20);
        Human.maxEnergy = 100; //the max energy

        //when
        testHuman.eat(testFruit1);
        testHuman.eat(testFruit2);
        testHuman.eat(testFruit3);
        int actualEnergy = testHuman.getEnergy();

        //then
        Assert.assertEquals(100, actualEnergy);

    }

    @Test
    
    public void workMinTest(){
        Human testHuman = new Human("Dave", "Bodden");
        int expectedEnergy = 50; 

        //when 
        testHuman.work(6); //takes us below zero when starting with 50 energy
        int actualEnergy = testHuman.getEnergy();

        //Then 
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test 

    public void maxEnergyChangeTest(){
        Human h1 = new Human ("Fa", "Lada");
        Fruit testFruit1 = new Fruit("Dragon Fruit", 20);
        Fruit testFruit2 = new Fruit("Orange", 20);
        Fruit testFruit3 = new Fruit("Apple", 20);

        Human.maxEnergy = 150;

        h1.eat(testFruit1);
        h1.eat(testFruit2); 
        h1.eat(testFruit3); 

        int actualEnergy = h1.getEnergy();


        Assert.assertEquals(110, actualEnergy);



    }
}