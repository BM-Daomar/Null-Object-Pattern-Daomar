public class NullAnimal extends AbstractAnimal {

    @Override
    public String getName() {
       return "Animal is not on list!";
    }
 
    @Override
    public boolean isNil() {
       return true;
    }
 }
