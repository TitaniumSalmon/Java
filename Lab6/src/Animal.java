public class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void sound(){
        System.out.println("Animal make a sound!");
    }
}
