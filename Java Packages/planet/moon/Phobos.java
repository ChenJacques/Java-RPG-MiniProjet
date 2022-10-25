package planet.moon;

public class Phobos {
    private planet.Mars mars;
    private String landingSite;

    public Phobos(planet.Mars mars, String landingSite){
        System.out.println("Phobos placed in orbit.");
        this.landingSite = landingSite;
    }

    public Phobos(){
        System.out.println("No planet given.");
    }




    public planet.Mars getMars(){
        return mars;
    }

    public String getLandingSite(){
        return landingSite;
    }
}
