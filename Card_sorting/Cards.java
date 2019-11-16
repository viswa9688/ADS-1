import java.util.ArrayList;
import java.util.List;

class Cards
{
    String Suite_name;
    String card_value;
    int Suite;
    int Card_value;
    
    int final_value=0;
    List<Integer> final_value_array = new ArrayList<>();

    public Cards(int Suite, int Card_value)
    {
        
        // System.out.println("Enter the Suite option number: ");
        // System.out.println("1.Diamonds");
        // System.out.println("2.Clubs");
        // System.out.println("3.Hearts");
        // System.out.println("4.Spades");
        // System.out.println("Card_value");
        
        if(Suite==1)
        {
            Suite=1;
        }
        else if(Suite==2)
        {
            Suite=2;
        }
        else if(Suite==3)
        {
            Suite=3;
        }
        else if(Suite==4)
        {
            Suite=4;
        }
        if(Card_value==1)
        {
            Card_value=1;
        }
        if(Card_value==2)
        {
            Card_value=2;
        }
        if(Card_value==3)
        {
            Card_value=3;
        }if(Card_value==4)
        {
            Card_value=4;
        }if(Card_value==5)
        {
            Card_value=5;
        }if(Card_value==6)
        {
            Card_value=6;
        }if(Card_value==7)
        {
            Card_value=7;
        }if(Card_value==8)
        {
            Card_value=8;
        }if(Card_value==9)
        {
            Card_value=9;
        }if(Card_value==10)
        {
            Card_value=10;
        }if(Card_value==11)
        {
            Card_value=11;
        }if(Card_value==12)
        {
            Card_value=12;
        }if(Card_value==13)
        {
            Card_value=13;
        }
        final_value=Suite+Card_value;
        final_value_array.add(final_value);
        System.out.println(final_value_array);
        

    }
}