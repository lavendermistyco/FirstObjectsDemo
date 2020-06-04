package faith.codedifferently;

public class Human {
    
    private String firstName;
    private String lastName;
    static int maxEnergy = 100; //static keyword makes only one copy for every object. all the objects point to that one variable. 
    private int energy; //Keeps track of the energy of the human


    //creating a constructor
    //all must have the same name as the class

    public Human(String first, String last){
       this.firstName = first; 
       this.lastName = last; 
       //this keyword means look at the outside class variables
       this.energy = 50; //this is the default value
    }

    //wnat the human to eat fruit to gain energy

    public void eat(Fruit fruit){
        if (this.energy + fruit.getEnergyOffers() <= maxEnergy){
            this.energy += fruit.getEnergyOffers();
        } else {
            this.energy = maxEnergy; 
            System.out.println("We are full of energy!");
        }
    }

    //human should work then lose a bit of energy
    public void work(int hoursWork){
        int energySpent = hoursWork * 10; 
        if(this.energy - energySpent < 0){
            //this.energy = 50;
            System.out.println("Unable to do specific work. Energy is too low. Try to eat something. ");
        } else {
            this.energy = this.energy - energySpent; //this.energy refers to the current energy

        }
        

    }

    //create a getter for energy
    public int getEnergy(){
        return this.energy; 
    }

    public String getFirst(){
        return this.firstName; 
    }

    public String getLast(){
        return this.lastName;
    }

}