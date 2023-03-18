public class RealAnimal extends AbstractAnimal {

    public RealAnimal(String name) {
       this.name = name;		
    }
    
    @Override
    public String getName() {
       return name;
    }
    
    @Override
    public boolean isNil() {
       return false;
    }
 }