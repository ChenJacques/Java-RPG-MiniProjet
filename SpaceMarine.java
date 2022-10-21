abstract class SpaceMarine extends Unit {
    protected Weapon weapon;

    protected SpaceMarine (String name, int hp, int ap){
        super(name, hp, ap);
    }

    public boolean equip(Weapon weapon){
        if (weapon.getEquipped() == false) {
        weapon.setEquipped(true);
        this.weapon = weapon;
        System.out.println(name+" has been equipped with a "+weapon.getName()+".");
        return true;
        } else {
            return false;
        }
    }

    public boolean attack(Fighter target){
        if (this.weapon == null) {
            System.out.println(name+": Hey, this is crazy. I'm not going to fight this empty-handed.");
            return false;
        } else if (this.weapon.isMelee() == true && this.moveCloseTo(target) == false) {
            System.out.println(name+": I'm too far away from "+target.getName()+".");
            return false;
        } else if (this.ap < weapon.getApcost()) {
            return false;
        } else if (this.ap >= weapon.getApcost() && this.weapon.isMelee() == true && this.moveCloseTo(target) == true){
            target.receiveDamage(this.weapon.getDamage());
            this.ap = this.ap - this.weapon.getApcost();
            return true;
        } else if (this.ap >= weapon.getApcost() && this.weapon.isMelee() == false) {
            target.receiveDamage(this.weapon.getDamage());
            this.ap = this.ap - this.weapon.getApcost();            
            return true;
        } else {
            return false;
        }    
    }

    @Override
    public boolean moveCloseTo(Fighter target){
        if (this.weapon.isMelee() == true) {
            if (this.hp == 0) {
                return false;
            } else if (target != this && this.closeTo!=target) {
                this.closeTo = target;
                System.out.println(name+" is moving closer to "+target.getName()+".");
                return true;
            }
        } 
        return false;
    }

    @Override
    public void recoverAP(){
        this.ap+=(int)(Math.random()*(9-0+1)+0);
        if (this.ap > 50){
            this.ap = 50;
        }
    }    



    public Weapon getWeapon(){
        return weapon;
    }
}