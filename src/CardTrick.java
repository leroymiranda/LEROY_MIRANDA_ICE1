import card.Card;
import java.util.Scanner;

/*
Name - Leroy Miranda
Student ID - 991717315

 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] magicHand = new Card[7];
        Scanner in = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            System.out.print("User Suit = ");
            String s = in.next();
            System.out.print("User value = ");
            int  v = in.nextInt();
            
            System.out.println("User card = "+ s + " " + v);
        
            Card c = new Card();
            
            c.setValue((int)(Math.random()*13+1));
            
            c.setSuit(Card.SUITS[(int)(Math.random()*3+0)]);
            
            magicHand[i]= c;
            
            System.out.println("Card = " + magicHand[i].getSuit()+""+magicHand[i].getValue());
                   
            
            
        }
        
        
    }
    
}
