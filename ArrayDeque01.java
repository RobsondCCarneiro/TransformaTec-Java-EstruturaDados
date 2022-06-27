import java.util.ArrayDeque;

public class ArrayDeque01 {
    public static void main(String[] args) {
        ArrayDeque<String> cards = new ArrayDeque<String>();

        cards.add("Copas");
        cards.add("Ouros");
        cards.add("Paus");
        cards.add("Espadas");

        for (String card : cards) {
            System.out.println("Figurinha: " + card);
        }

        cards.clear();

        System.out.println("Figurinhas " + cards);

        cards.addLast("Romario");
        cards.add("Pelé");
        cards.add("Neymar");
        cards.addFirst("Romario");

        System.out.println("Figurinhas " + cards);
    }
}
