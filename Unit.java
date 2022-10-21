abstract class Unit implements Fighter {
    protected String name;
    protected int hp;
    protected int ap;
    protected Fighter closeTo;

    protected Unit(String name, int hp, int ap){
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    public void receiveDamage(int damage){      
        this.hp = this.hp - damage;
            if (this.hp < 0){
                this.hp = 0;
            }
    }

    public boolean moveCloseTo(Fighter target){
        if (this.hp == 0) {
            return false;
        } else if (target != this && this.closeTo!=target) {
            this.closeTo = target;
            System.out.println(name+" is moving closer to "+target.getName()+".");
            return true;
        } else {
            return false;
        }
    }

    public void recoverAP(){
        this.ap+=(int)(Math.random()*(7-0+1)+0);
        if (this.ap > 50){
            this.ap = 50;
        }
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    public int getAp(){
        return ap;
    }

    public Fighter getCloseTo(){
        return closeTo;
    }


} 