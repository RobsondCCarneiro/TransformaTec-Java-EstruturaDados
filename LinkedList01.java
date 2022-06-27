import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();

        names.add("Robson");
        names.add("Rodrigo");
        names.add("Ricardo");
        names.add("Ryan");

        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.remove("Robson");
        names.remove(2);

        System.out.println("Após o nome ser removido");
        System.out.println(names);
    }
}
