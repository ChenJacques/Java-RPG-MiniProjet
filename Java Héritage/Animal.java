public class Animal {
    protected enum Type {
        MAMMAL,
        FISH,
        BIRD
    }
    protected String name;
    protected int legs;
    protected String type;
    private static int numberOfAnimals;
    private static int numberOfMammals;
    private static int numberOfFish;
    private static int numberOfBirds;

    protected Animal(String name, int legs, Type tope){
        this.type = tope.toString().toLowerCase();
        this.name = name;
        this.legs = legs;
        System.out.println("My name is "+name+" and I am a "+type+"!");
        numberOfAnimals=++numberOfAnimals;
        switch(type){
            case "mammal" :
            numberOfMammals=++numberOfMammals;
            break;
            case "fish" :
            numberOfFish=++numberOfFish;
            break;
            case "bird" :
            numberOfBirds=++numberOfBirds;
            break;
        }
    }

    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getLegs(){
        return legs;
    }

    public static int getNumberOfAnimals(){
        if (numberOfAnimals == 1) {
        System.out.println("There is currently "+numberOfAnimals+" animal in our world.");
        } else {
            System.out.println("There are currently "+numberOfAnimals+" animals in our world.");
        }
        return numberOfAnimals;
    }

    public static int getNumberOfMammals(){
        if (numberOfMammals == 1) {
        System.out.println("There is currently "+numberOfMammals+" mammal in our world.");
        } else {
            System.out.println("There are currently "+numberOfMammals+" mammals in our world.");
        }
        return numberOfMammals;
    }

    public static int getNumberOfFish(){
        if (numberOfFish == 1) {
        System.out.println("There is currently "+numberOfFish+" fish in our world.");
        } else {
            System.out.println("There are currently "+numberOfFish+" fish in our world.");
        }
        return numberOfFish;
    }      

    public static int getNumberOfBirds(){
        if (numberOfBirds == 1) {
        System.out.println("There is currently "+numberOfBirds+" bird in our world.");
        } else {
            System.out.println("There are currently "+numberOfBirds+" birds in our world.");
        }
        return numberOfBirds;
    }            


}