package exceptions;
import java.util.ArrayList;
import java.util.List;

public class ArrayException {
    
    static void getNames(ArrayList<String> names) throws IndexOutOfBoundsException{

        int i = 10;

        if(names.size() <= i){
            throw new IndexOutOfBoundsException("Indice fora do array");
        }

        String name = names.get(i);
        
        System.out.println(name);
    }

    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<String>();

        names.add("Robson");
        names.add("Robinson");
        names.add("Rob");

        getNames(names);
    }
}
