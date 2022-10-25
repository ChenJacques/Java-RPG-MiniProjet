public class Shark extends Animal {
    private boolean frenzy;

    public Shark(String name) {
        super(name, 0, Animal.Type.FISH);
        System.out.println("A KILLER IS BORN!");
        this.frenzy = false;
    }   

    public void smellBlood(boolean blood){
        this.frenzy = blood;
    }

    public void status(){
        if (frenzy == false) {
            System.out.println(name+" is swimming peacefully.");
        }
        if (frenzy == true) {
            System.out.println(name+" is smelling blood and wants to kill.");
        }
    }

    public boolean canEat(Animal sacrifice){
        if (sacrifice.getName() != name) {
            return true;
        } else {
            return false;
        }
    }

    public void eat(Animal sacrifice){
        if (canEat(sacrifice) == true) {
        System.out.println(name+" ate a "+sacrifice.getType()+" named "+ sacrifice.getName()+".");
            if (frenzy = true) {
                frenzy = false;
            }
        } else {
            System.out.println(name+": It's not worth my time.");
        }
    }
}