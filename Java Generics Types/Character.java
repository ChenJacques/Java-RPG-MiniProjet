abstract class Character implements Comparable<Character> {
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected final String RPGClass;
    protected int capacity = 0;

    protected Character(String name, String RPGClass){
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    protected Character(String name, String RPGClass, int capacity){
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
        this.capacity = capacity;
    }

    public int compareTo(Character personnage){
        if (personnage != this) {
            if (personnage.getRPGClass() == this.getRPGClass()) {
                return this.getCapacity()-personnage.getCapacity();
            } else if (this.getRPGClass() == "Mage" && personnage.getRPGClass() == "Warrior") {
                if (personnage.getCapacity()%this.getCapacity() != 0) {
                    return +1;
                } else {
                    return -1;
                }
            } else if (this.getRPGClass() == "Warrior" && personnage.getRPGClass() == "Mage") {
                if (this.getCapacity()%personnage.getCapacity() == 0) {
                return -1;
                } else {
                    return +1;
                }
            }
        } 
        return 0;
    }

    public void attack(String string){
        System.out.println(name+": Rrrrrrrrr....");
    }

    // @Override
    // public void moveRight(){
    //     System.out.println(name+": moves right");
    // }

    // @Override
    // public void moveLeft(){
    //     System.out.println(name+": moves left");
    // }

    // @Override
    // public void moveForward(){
    //     System.out.println(name+": moves forward");        
    // }

    // @Override
    // public void moveBack(){
    //     System.out.println(name+": moves back");
    // }

    protected final void unsheathe(){
        System.out.println(name+": unsheathes his weapon.");
    }



	public String getName() {
		return this.name;
	}

	public int getLife() {
		return this.life;
	}

	public int getAgility() {
		return this.agility;
	}

	public int getStrength() {
		return this.strength;
	}

	public int getWit() {
		return this.wit;
	}

	public String getRPGClass() {
		return this.RPGClass;
	}

    public int getCapacity(){
        return this.capacity;
    }

}