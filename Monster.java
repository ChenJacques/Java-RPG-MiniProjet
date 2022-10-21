abstract class Monster extends Unit{
    protected int damage = 0;
    protected int apcost = 0;

    protected Monster(String name, int hp, int ap){
        super(name, hp, ap);
    }

    public boolean equip(Weapon weapon){
        System.out.println("Monsters are proud and fight with their own bodies.");
        return false;
    }

    public boolean attack(Fighter target){
        if (this.getCloseTo() != target) {
            System.out.println(this.getName()+": I'm too far away from "+target.getName()+".");
            return false;
        } else if (this.getAp() >= this.apcost) {
            this.ap = this.ap - this.apcost;
            System.out.println(this.getName()+" attacks "+target.getName()+".");
            target.receiveDamage(this.damage);
            return true;

        } else {
            return false;
        }
    }

    public int getDamage(){
        return damage;
    }

    public int getApcost(){
        return apcost;
    }
}