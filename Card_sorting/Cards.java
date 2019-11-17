import java.util.ArrayList;
import java.util.List;

class Cards
{
    String Suite_name;
    String card_value;
    int Suite;
    int Card_value;
     
    String final_name;
    
    int final_value=0;
    

    public Cards(String Suite_name,String card_value,int Suite, int Card_value)
    {
        
        // System.out.println("Enter the Suite option number: ");
        // System.out.println("1.Diamonds");
        // System.out.println("2.Clubs");
        // System.out.println("3.Hearts");
        // System.out.println("4.Spades");
        // System.out.println("Card_value");
        
        this.Suite=Suite;
        this.Suite_name=Suite_name;
        this.card_value=card_value;
        this.Card_value=Card_value;
        final_value=Suite+Card_value;
        final_name=Suite_name+" "+card_value;
        
        //System.out.println(Suite_name);
        //System.out.println(card_value);

        
        
    }
    public String final_name(String Suite_name ,String card_value)
    {
        
        final_name=Suite_name+card_value;
        System.out.println(final_name);
        return final_name;
    }
    public int final_value(int Card_value, int Suite)
    {
        final_value=Card_value+Suite;
        System.out.println(final_value);
        return final_value;
    }
}