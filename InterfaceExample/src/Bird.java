public class Bird implements Flyable, Soundable{
    @Override
    public void fly()
    {
        System.out.println("The bird flaps its wings and flies.");
    }
    @Override
    public void makeSound()
    {
        System.out.println("The bird sings a sweet song.");
    }
}
