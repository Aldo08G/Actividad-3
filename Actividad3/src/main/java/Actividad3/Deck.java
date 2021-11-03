package Actividad3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    
    public static final String[] PALOS={"TREBOLES", "CORAZONES", "PICAS", "DIAMANTES"};
    public static final String[] COLORES={"ROJO", "NEGRO"};
    public static final String[] VALORES={"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
    
    private ArrayList<Card> deck;
    
    public Deck(){
       
        deck = new ArrayList<Card>();

        for (int palo = 0; palo < 2; palo++)
            for (int valor = 0; valor < VALORES.length; valor++)
                deck.add(new Card(PALOS[palo], COLORES[0], VALORES[valor]));
             
        for (int palo = 2; palo < 4; palo++)
            for (int valor = 0; valor < VALORES.length; valor++)
                deck.add(new Card(PALOS[palo], COLORES[1], VALORES[valor]));
    }
    
    public int getSize(){
        return deck.size();
    }
    
    public ArrayList<Card> getDeck(){
        return deck;
    }
    
    public void shuffle(){
        Collections.shuffle(deck);
        System.out.println("Se mezcló el Deck.");
        for (Card elemento : deck){
            System.out.print(elemento+" / ");
        }
    }
    
    public void head(){
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan "+ deck.size()+ " cartas en deck");
    }
    
    public void pick(){
        Random random = new Random();
        System.out.println(deck.get(random.nextInt(deck.size())));
        deck.remove(random.nextInt(deck.size()));
        System.out.println("Quedan "+deck.size()+" cartas en deck");
    }
    
    public void hand(){
        for(int i=0; i<5; i++){
            System.out.println(deck.get(i));
        }
        for (int i=0; i<5; i++){
            deck.remove(i);
        }
        System.out.println("Quedan "+deck.size()+ " cartas en deck");
    }
}