public class AnimalFactory {
	
    public static final String[] names = {"Rat", "Snake", "Dog", "Cat"};
 
    public static AbstractAnimal getAnimal(String name){
    
       for (int i = 0; i < names.length; i++) {
          if (names[i].equalsIgnoreCase(name)){
             return new RealAnimal(name);
          }
       }
       return new NullAnimal();
    }
 }