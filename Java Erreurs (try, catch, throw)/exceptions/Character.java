abstract class Character implements Movable {
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected final String RPGClass;

    protected Character(String name, String RPGClass){
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    public void attack(String string) throws WeaponException{
        System.out.println(name+": Rrrrrrrrr....");
    }

    public void tryToAttack(String string){
        try {
            this.attack(string);
        } catch (WeaponException e){
            System.out.println(e.getMessage());

        }
    }

    @Override
    public void moveRight(){
        System.out.println(name+": moves right");
    }

    @Override
    public void moveLeft(){
        System.out.println(name+": moves left");
    }

    @Override
    public void moveForward(){
        System.out.println(name+": moves forward");        
    }

    @Override
    public void moveBack(){
        System.out.println(name+": moves back");
    }

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


}