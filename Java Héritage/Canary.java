public class Canary extends Animal {
    private static int eggs;

    public Canary(String name) {
        super(name, 2, Animal.Type.BIRD);
        System.out.println("Yellow and smart? Here I am!");
        this.eggs = 0;
    }  

    public static int getEggsCount(){
        return eggs;
    }

    public void layEgg(){
        eggs=++eggs;
    }


}