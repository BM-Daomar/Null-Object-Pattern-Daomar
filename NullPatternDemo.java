public class NullPatternDemo {
    public static void main(String[] args) {
 
       AbstractAnimal animal1 = AnimalFactory.getAnimal("Cat");
       AbstractAnimal animal2 = AnimalFactory.getAnimal("Dog");
       AbstractAnimal animal3 = AnimalFactory.getAnimal("Rabbit");
       AbstractAnimal animal4 = AnimalFactory.getAnimal("Bird");
 
       System.out.println("Animals");
       System.out.println(animal1.getName());
       System.out.println(animal2.getName());
       System.out.println(animal3.getName());
       System.out.println(animal4.getName());
    }
 }