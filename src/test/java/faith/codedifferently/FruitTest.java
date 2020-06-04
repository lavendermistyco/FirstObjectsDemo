package faith.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class FruitTest {
    
    @Test
    public void constructorTest(){
        //Given
        String type = "Strawberry"; 
        int energyOffers = 20; 
        //When
        Fruit testFruit = new Fruit(type, energyOffers); 
        String actualType = testFruit.getType();
        int actualEnergy = testFruit.getEnergyOffers(); 

        //Then
        Assert.assertEquals(type, actualType);
        Assert.assertEquals(energyOffers, actualEnergy);
    }
}