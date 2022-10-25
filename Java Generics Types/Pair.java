public class Pair<T, V> {
    private T first;
    private V second;

    public Pair(T first, V second){
        this.first = first;
        this.second = second;

    }

    public void display(){
        System.out.println("first: "+first+", second: "+second+".");
    }

    public T getFirst() {
		return this.first;
	}

	public V getSecond() {
		return this.second;
	}

}