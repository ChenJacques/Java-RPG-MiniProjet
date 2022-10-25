public class GreatWhite extends Shark{

    public GreatWhite(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal sacrifice){
        if (sacrifice instanceof Canary == false && sacrifice.getName() != name) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void eat(Animal sacrifice){
        if (sacrifice instanceof Canary == true) {
            System.out.println(name+": Next time you try to give me that to eat, I'll eat you instead.");
        } else if (canEat(sacrifice) == true) {
        System.out.println(name+" ate a "+sacrifice.getType()+" named "+ sacrifice.getName()+".");
        smellBlood(false);
        } else {
            System.out.println(name+": It's not worth my time.");
        }
    }           

}