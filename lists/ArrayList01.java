package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<Integer>(3);

        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(22);
        numbers.add(21);
        numbers.add(52);
        numbers.add(5);
        numbers.add(0);
        numbers.add(8);
        numbers.add(9);
        numbers.add(12);
        numbers.add(14);

        System.out.println(numbers);

        //Obtem pelo index
        System.out.println(numbers.get(3));
        //Obtem pelo index
        System.out.println(numbers.get(2));



        //Ordenando em ordem crescente
        Collections.sort(numbers);
        System.out.println("Numeros ordenados crescente: " + numbers);
        
        //Ordenando em ordem decrescente
        Collections.reverse(numbers);
        System.out.println("Numeros ordenados decrescente: " + numbers);

        System.out.println(numbers);

    }
}