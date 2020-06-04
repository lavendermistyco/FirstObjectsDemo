package faith.codedifferently;

public class Fruit {
    private String type; 
    private int energyOffers; 

    public Fruit(String t, int energy){
        this.type = t; 
        this.energyOffers = energy; 
    
    }
    
    public String getType(){
        return this.type;
    }

    public int getEnergyOffers(){
        return this.energyOffers;
    }
    
}