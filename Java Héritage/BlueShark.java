public class BlueShark extends Shark{

    public BlueShark(String name) {
        super(name);
    }    

    @Override
    public boolean canEat(Animal sacrifice){
        if (sacrifice.getType() == "fish" || sacrifice.getName() != name) {
            return true;
        } else {
            return false;
        }
    }
}