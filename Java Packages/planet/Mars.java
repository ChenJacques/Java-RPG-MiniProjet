package planet;


public class Mars {
    private int id;
    private static int count;
    private String landingSite;

    public Mars (String landingSite){
        this.id= id + count;
        count = count + 1;
        this.landingSite = landingSite;
    }

    public int getId() {
        return id;      
    }

    public String getLandingSite(){
        return landingSite;
    }
}