public class Cat extends Animal{
    public Cat(String name){
        super("Boonmee");
    }
    @Override
    public void sound(){
        System.out.println(super.getName()+": Meow Meow");
    }
}
