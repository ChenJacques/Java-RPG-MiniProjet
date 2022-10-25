public class Astronaut {
    private String name;
    private int snacks = 0;
    private String destination = null;
    private int id;
    private static int count;
    private static int chococount;

    public Astronaut(String name) {
        this.name = name;
        this.id= id + count;
        count = count + 1;
        System.out.println(name +" ready for launch!");
    }

    public void doActions(){
        System.out.println(name +": Nothing to do.");
        if(destination == null) {
            System.out.println(name +": I may have done nothing, but I have "+snacks+" Mars to eat at least!");
        }
        
    }

    public void doActions(planet.Mars planet){
        System.out.println(name +": Started a mission!");
        this.destination = planet.getLandingSite();
    }

    public void doActions(chocolate.Mars chocolate){
        System.out.println(name +": Thanks for this mars number "+chocolate.getId());
        this.snacks=++chococount;
        // chococount =++chococount ;
        System.out.println(name +": I may have done nothing, but I have "+snacks+" Mars to eat at least!");
    }

    public String getName() {
        return name;      
    }

    public int getSnacks(){
        return snacks;
    }

    public String getDestination(){
        return destination;
    }

    public int getId(){
        return id;
    }



}
