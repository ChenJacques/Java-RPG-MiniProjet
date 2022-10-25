public class Duet<T> {

    public Duet(){
    }

    public static <T extends Comparable<T>> T min(T one, T two){
        if (one.compareTo(two) < 0) {
            return one;
        } else {
            return two;
        }
    }

    public static <T extends Comparable<T>> T max(T one, T two){
        if (one.compareTo(two) < 0) {
            return two;
        } else {
            return one;
        }
    }

}