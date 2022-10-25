public class Mars {
    private int id;
    private static int count;

    public Mars (){
        this.id= id + count;
        count = count + 1;
    }
    public int getId() {
        return id;
        
    }
}