import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Battalion{

    protected ArrayList<Character> characters = new ArrayList<>();

    public Battalion(){
    }

    public <T> void add(List<T> something){
        for (T nom : something) {
            if (nom instanceof Character) {
                characters.add((Character) nom);
            }
        }
    }
    
    public void display(){
        this.characters.forEach(something -> System.out.println(something.getName()));
    }

    public boolean fight(){
        if (this.characters.size() >= 2) {
            Character a = this.characters.get(0);
            Character b = this.characters.get(1);
            if (a.compareTo(b) < 0) {
                this.characters.remove(0);
                return true;
            } else if (a.compareTo(b) > 0) {
                this.characters.remove(1);
                return true;
            } else if (a.compareTo(b) == 0) {
                this.characters.remove(0);
                this.characters.remove(1);
                return true;
            }    
        } 
        return false;      
    }
}